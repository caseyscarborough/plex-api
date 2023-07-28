package plex.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import lombok.Getter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import plex.api.exception.BadRequestException;
import plex.api.exception.NotFoundException;
import plex.api.exception.PlexException;
import plex.api.exception.ServerException;
import plex.api.exception.UnauthorizedException;

import java.io.IOException;
import java.util.Objects;

final class PlexClient {

    private static final String X_PLEX_TOKEN_HEADER = "X-Plex-Token";

    @Getter
    private final String host;
    private final String token;
    private final OkHttpClient client;
    private final XmlMapper mapper;
    private final ConverterFactory factory;

    PlexClient(String host, String token) {
        this.host = host;
        this.token = token;
        this.mapper = new XmlMapper();
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.mapper.registerModule(new JaxbAnnotationModule());
        this.client = new OkHttpClient.Builder().addInterceptor(chain ->
            chain.proceed(
                chain.request()
                    .newBuilder()
                    .addHeader(X_PLEX_TOKEN_HEADER, PlexClient.this.token)
                    .build()))
            .build();
        this.factory = new ConverterFactory();
    }

    void get(final String path) {
        request("GET", path);
    }

    <F, T> T get(final String path, Class<F> from, Class<T> to) {
        return request(builder("GET"), path, from, to);
    }

    void post(final String path) {
        request("POST", path);
    }

    void post(final String path, byte[] bytes) {
        final Request.Builder builder = new Request.Builder().post(RequestBody.create(bytes));
        request(builder, path);
    }

    void put(final String path) {
        request("PUT", path);
    }

    private String request(final String method, final String path) {
        return this.request(builder(method), path, String.class, String.class);
    }

    private String request(Request.Builder builder, final String path) {
        return this.request(builder, path, String.class, String.class);
    }

    private <F, T> T request(Request.Builder builder, final String path, Class<F> from, Class<T> to) {
        final String url = this.host + path;
        final Request request = builder
            .url(url)
            .build();

        try (Response response = this.client.newCall(request).execute()) {
            final int code = response.code();
            final ResponseBody body = Objects.requireNonNull(response.body());
            if (response.isSuccessful()) {
                if (from == String.class && to == String.class) {
                    return (T) body.string();
                } else if (to == byte[].class) {
                    return (T) body.bytes();
                } else {
                    F parsed = this.mapper.readValue(body.string(), from);
                    Converter<F, T> converter = factory.getInstance(from, to);
                    return converter.convert(parsed);
                }
            }

            final String message = String.format("(%d) %s - %s", code, url, body.string().replace("\n", " "));
            switch (code) {
                case 401:
                    throw new UnauthorizedException(message);
                case 404:
                    throw new NotFoundException(message);
                case 500:
                    throw new ServerException(message);
                default:
                    throw new BadRequestException(message);
            }
        } catch (IOException e) {
            throw new PlexException("Could not make call to " + url, e);
        }
    }

    private Request.Builder builder(final String method) {
        Request.Builder builder = new Request.Builder();
        switch (method) {
            case "GET":
                return builder.get();
            case "PUT":
                return builder.put(RequestBody.create("", null));
            case "POST":
                return builder.post(RequestBody.create("", null));
            case "DELETE":
                return builder.delete();
            default:
                throw new IllegalArgumentException("Could not create request for " + method + " method");
        }
    }
}

package plex.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import lombok.Getter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
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

    <F, T> T get(final String path, Class<F> from, Class<T> to) {
        final String url = this.host + path;
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = this.client.newCall(request).execute()) {
            final int code = response.code();
            final String body = Objects.requireNonNull(response.body()).string();
            if (response.isSuccessful()) {
                F parsed = this.mapper.readValue(body, from);
                Converter<F, T> converter = factory.getInstance(from, to);
                return converter.convert(parsed);
            }

            final String message = String.format("(%d) %s - %s", code, url, body.replace("\n", " "));
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
}

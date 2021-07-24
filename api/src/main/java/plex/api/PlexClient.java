package plex.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import plex.api.exception.BadRequestException;
import plex.api.exception.NotFoundException;
import plex.api.exception.PlexException;
import plex.api.exception.ServerException;
import plex.api.exception.UnauthorizedException;
import plex.api.model.Library;
import plex.api.model.Section;
import plex.api.model.Server;
import plex.api.response.LibraryResponse;
import plex.api.response.SectionResponse;
import plex.api.response.ServerResponse;
import plex.api.response.converter.Converter;
import plex.api.response.converter.ConverterFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class PlexClient {

    private static final String DEFAULT_SERVER = "http://localhost:32400";
    private static final String X_PLEX_TOKEN_HEADER = "X-Plex-Token";

    private final OkHttpClient client;
    private final XmlMapper mapper;
    private final String server;
    private final String token;

    public PlexClient(String token) {
        this(DEFAULT_SERVER, token);
    }

    public PlexClient(String server, String token) {
        this.server = server.endsWith("/") ? server.substring(0, server.length() - 1) : server;
        this.token = token;
        this.mapper = new XmlMapper();
        this.mapper.registerModule(new JaxbAnnotationModule());
        this.client = new OkHttpClient.Builder().addInterceptor(chain ->
            chain.proceed(
                chain.request()
                    .newBuilder()
                    .addHeader(X_PLEX_TOKEN_HEADER, PlexClient.this.token)
                    .build()))
            .build();
    }

    public Server server() {
        return get(ObjectType.SERVER, ServerResponse.class, Server.class);
    }

    public Library library() {
        try {
            return get(ObjectType.LIBRARY, LibraryResponse.class, Library.class);
        } catch (BadRequestException e) {
            // Fallback to /library/sections on bad request, only owners can call /library.
            return get(ObjectType.SECTION, SectionResponse.class, Library.class);
        }
    }

    public List<Section> sections() {
        return Arrays.asList(get(ObjectType.SECTION, SectionResponse.class, Section[].class));
    }

    private <F, T> T get(ObjectType type, Class<F> from, Class<T> to) {
        final String url = this.server + type.getPath();
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = this.client.newCall(request).execute()) {
            final int code = response.code();
            final String body = Objects.requireNonNull(response.body()).string();
            if (response.isSuccessful()) {
                F parsed = this.mapper.readValue(body, from);
                Converter<F, T> converter = new ConverterFactory().getInstance(from, to);
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

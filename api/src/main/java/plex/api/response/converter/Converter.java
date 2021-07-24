package plex.api.response.converter;

public interface Converter <F, T> {

    T convert(F input);
}

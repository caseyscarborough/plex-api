package plex.api;

interface Converter <F, T> {

    T convert(F input);

    Class<F> from();

    Class<T> to();
}

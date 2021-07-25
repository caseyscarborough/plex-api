package plex.api;

public interface Filter<T> {

    boolean filter(T object);
}

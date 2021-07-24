package plex.api;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

abstract class BaseConverter<F, T> implements Converter<F, T> {

    protected Boolean toBoolean(Integer value) {
        return value != null && value.equals(1);
    }

    protected List<String> toList(String list) {
        return Arrays.stream(list.split(",")).map(String::trim).collect(Collectors.toList());
    }

    protected LocalDateTime toLocalDateTime(long epoch) {
        return Instant.ofEpochSecond(epoch).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}

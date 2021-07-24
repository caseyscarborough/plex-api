package plex.api;

import org.apache.commons.lang3.StringUtils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

abstract class BaseConverter<F, T> implements Converter<F, T> {

    protected Boolean toBoolean(Integer value) {
        return value != null && value.equals(1);
    }

    protected List<String> toList(String list) {
        if (StringUtils.isBlank(list)) {
            return new ArrayList<>();
        }
        return Arrays.stream(list.split(",")).map(String::trim).collect(Collectors.toList());
    }

    protected LocalDateTime toLocalDateTime(long epoch) {
        return Instant.ofEpochSecond(epoch).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    protected LocalDate toLocalDate(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date, formatter);
    }
}

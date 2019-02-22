package com.yunaprk.hikpluginserver.util;

import com.google.common.base.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime <-> Long
 * @author xzhang
 */
@Component
public class LocalDateTimeConverter extends Converter<LocalDateTime, Long> {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    @Override
    protected Long doForward(LocalDateTime localDateTime) {
        return Long.valueOf(formatter.format(localDateTime));
    }

    @Override
    protected LocalDateTime doBackward(Long aLong) {
        return null;
    }
}

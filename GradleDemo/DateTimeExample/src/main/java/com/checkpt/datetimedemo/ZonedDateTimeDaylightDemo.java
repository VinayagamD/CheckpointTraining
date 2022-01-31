package com.checkpt.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeDaylightDemo {

    public static void main(String[] args) {
        ZoneId auckZone = ZoneId.of("Pacific/Auckland");
        LocalDateTime base = LocalDate.of(1957, 01, 01).atStartOfDay();
        ZonedDateTime baseDate = base.atZone(auckZone);
        ZonedDateTime endDate = LocalDate.parse("20220131", DateTimeFormatter.ofPattern("yyyyMMdd")).atStartOfDay().atZone(auckZone);
        System.out.println(baseDate.until(endDate, ChronoUnit.DAYS));
    }
}

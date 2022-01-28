package com.checkpt.datetimedemo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

       LocalDateTime localDateTimeBefore  = LocalDateTime.of(2021,1,1,0,0);
        System.out.println(localDateTimeBefore.isBefore(localDateTime));
        System.out.println(localDateTimeBefore.isAfter(localDateTime));
       dateTimeFormatter =DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss Z");
        System.out.println(offsetDateTime.format(dateTimeFormatter));
        System.out.println(zonedDateTime.format(dateTimeFormatter));
        System.out.println(localDateTime.plus(7, ChronoUnit.DAYS));
        System.out.println(localDateTime);
        localDateTime = localDateTime.plus(7, ChronoUnit.DAYS);
        System.out.println(localDateTime);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        zoneId = ZoneId.of("-05:00");
        System.out.println(zoneId);
        zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);
        zonedDateTime  = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime);
        zoneId = ZoneId.of("-05:00");
        zonedDateTime  = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime);
        ZoneOffset zoneOffset = ZoneOffset.ofHours(0);
        localDateTime = LocalDateTime.now();
        offsetDateTime = localDateTime.atOffset(zoneOffset);
        System.out.println("============= LocalDateTime ===========");
        System.out.println(localDateTime);
        System.out.println("========================================");
        System.out.println(offsetDateTime);
        zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime1);
    }
}

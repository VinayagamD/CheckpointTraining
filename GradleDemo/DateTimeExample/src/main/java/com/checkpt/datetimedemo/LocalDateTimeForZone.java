package com.checkpt.datetimedemo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeForZone {

    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a z";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public static void main(String[] args) {

        ZoneId fromTimeZone = ZoneId.of("Asia/Kolkata");    //Source timezone
        ZoneId toTimeZone = ZoneId.of("America/New_York");  //Target timezone

        LocalDateTime today = LocalDateTime.now();          //Current time

        //Zoned date time at source timezone
        ZonedDateTime currentISTime = today.atZone(fromTimeZone);

        //Zoned date time at target timezone
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(toTimeZone);

        //Format date time - optional
        System.out.println(formatter.format(currentISTime));
        System.out.println(formatter.format(currentETime));

    }
}

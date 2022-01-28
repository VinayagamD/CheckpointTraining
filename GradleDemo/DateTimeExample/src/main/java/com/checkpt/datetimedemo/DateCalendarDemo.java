package com.checkpt.datetimedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarDemo {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        date = new Date(System.currentTimeMillis());
        System.out.println(date);
        date = new Date(2020,1,28);
        System.out.println(date);
        date = new Date("2022/01/20");
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        date = simpleDateFormat.parse("2022-01-20");
        System.out.println(date);
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(simpleDateFormat.format(date));

        Calendar calendar =  Calendar.getInstance();
        System.out.println("================== Calendar ====================");
        System.out.println(calendar);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}

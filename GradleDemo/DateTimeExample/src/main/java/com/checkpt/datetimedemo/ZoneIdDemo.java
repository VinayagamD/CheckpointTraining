package com.checkpt.datetimedemo;

import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ZoneIdDemo {

    public static void main(String[] args) {
        Stream.of(ZoneId.getAvailableZoneIds()).forEach(System.out::println);
    }
}

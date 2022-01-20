package com.checkpt.java8.demo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,100).map(i-> i*2).filter(i->i%2==0);
        System.out.println(intStream.sum());
//        System.out.println(intStream.average());
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,10).map(i-> i*2).filter(i->i%2==0).count());

    }
}

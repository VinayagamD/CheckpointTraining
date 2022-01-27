package com.checkpt.java8.demo.streams.numerics;

import java.util.stream.IntStream;

public class NumericStream {

    public static void main(String[] args) {
        System.out.println("============== Range ===========");
        IntStream.range(1,10).forEach(System.out::println);

        System.out.println("============== Range Closed ===========");
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }
}

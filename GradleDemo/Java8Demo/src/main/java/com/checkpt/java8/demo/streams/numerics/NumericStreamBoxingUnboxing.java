package com.checkpt.java8.demo.streams.numerics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,50)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integerList){
        return integerList
                .stream().mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing : "+boxing());
        System.out.println("Unboxing : "+unboxing(boxing()));
    }
}

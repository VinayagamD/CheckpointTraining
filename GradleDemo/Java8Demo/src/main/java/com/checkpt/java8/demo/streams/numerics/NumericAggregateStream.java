package com.checkpt.java8.demo.streams.numerics;

import java.util.stream.IntStream;

public class NumericAggregateStream {

    public static void main(String[] args) {
        System.out.println("Sum Value "+ IntStream.rangeClosed(1,50).sum());
         IntStream.rangeClosed(1,25).max().ifPresentOrElse(System.out::println,()->{
             System.out.println("Max Value Not Found");
         });
         IntStream.rangeClosed(15,25).min().ifPresentOrElse(System.out::println,()->{
             System.out.println("Max Value Not Found");
         });
         IntStream.rangeClosed(1,50).average().ifPresentOrElse(System.out::println,()->{
                     System.out.println("Average Not Found");
                 }

         );
    }
}

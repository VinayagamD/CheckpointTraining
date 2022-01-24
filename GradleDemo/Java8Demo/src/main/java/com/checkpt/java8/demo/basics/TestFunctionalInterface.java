package com.checkpt.java8.demo.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestFunctionalInterface {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = ()->"TestString";
        Consumer<Boolean> booleanConsumer = System.out::println;
        Function<String,Integer> stringToInteger = String::length;
        Predicate<Integer> evenPredicate = data -> data%2 ==0;
        System.out.println(stringSupplier.get());
        System.out.println(stringToInteger.apply(stringSupplier.get()));
        System.out.println(evenPredicate.test(stringSupplier.get().length()));
        booleanConsumer.accept(stringSupplier.get().length()%2 ==0);

        booleanConsumer.accept(evenPredicate.test(stringToInteger.apply(stringSupplier.get())));

        // Within 100 integer I want all the sum of even data;
        int sum = 0;
        for (int i = 1; i<=100; i++){
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.println(sum);
        sum = 0;
        for(int i=2 ; i <=100 ; i += 2){
            sum +=i;
        }
        System.out.println(sum);

        System.out.println(IntStream.rangeClosed(1,100).filter(data -> data%2==0).sum());
        System.out.println(IntStream.rangeClosed(1,100).filter(data -> data%2==0).map(data -> data*2).sum());
        System.out.println(IntStream.rangeClosed(1,100).filter(data -> data%2!=0).map(data -> data*2).sum());




    }
}

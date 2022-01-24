package com.checkpt.java8.demo.basics.optional;

import com.checkpt.java8.demo.data.DataNotException;

import java.util.Optional;
import java.util.function.Supplier;

public class TestOptional {

    private static Supplier<String> stringSupplier = () -> "Test";

    public static void main(String[] args) {
        // Optional Example Basics
        Optional<String> optionalString  = Optional.of("Java 8 class");
        Optional<String> optionalString2 = Optional.ofNullable(null);
//        Optional<String> optionalString3 = Optional.of(null); //
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalString.isPresent());
        System.out.println(optionalEmpty.isPresent());
        System.out.println(optionalEmpty.orElse("Test"));
        System.out.println(optionalString.orElse("Test"));
        System.out.println(optionalString2.isPresent());
        System.out.println(optionalEmpty);
        System.out.println(optionalString);
//        System.out.println(optionalString3.isPresent());
        optionalEmpty.ifPresent(System.out::println);
        optionalString.ifPresent(System.out::println);

        // Optional Business Case
        System.out.println(optionalEmpty.orElseGet(stringSupplier));
        try {
            optionalEmpty.orElseThrow(()-> new DataNotException("String not found"));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            optionalEmpty.orElseThrow(DataNotException::new);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        // Map vs flatmap
        System.out.println(optionalString.map(String::toUpperCase));
        System.out.println(optionalString.flatMap(s -> Optional.of(s.toUpperCase())));

    }
}

package com.checkpt.java8.demo.streams;

import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.Objects;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
         StudentDataBase.getAllStudents().stream()
                 .filter(Objects::nonNull)
                 .filter(s -> s.getGpa() > 3.5)
                 .map(s -> {
                     s.setName(s.getName().toUpperCase());
                     return s;
                 }).toList().forEach(System.out::println);

    }
}

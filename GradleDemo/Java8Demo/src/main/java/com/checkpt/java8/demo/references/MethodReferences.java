package com.checkpt.java8.demo.references;

import com.checkpt.java8.demo.data.Student;

import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {
        Student student = ConstructorReference.studentSupplier.get();
        Supplier<String> name = student::getName;
        System.out.println(name.get());
    }
}

package com.checkpt.java8.demo.references;

import com.checkpt.java8.demo.data.DataSingleton;
import com.checkpt.java8.demo.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    static Supplier<DataSingleton> dataSingletonSupplier = DataSingleton::getInstance;
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> studentFunction = Student::new;
    static Function<String,Student> studentFunction2 = (name) -> new Student(name);

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("John Paul"));
    }
}

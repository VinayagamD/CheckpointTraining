package com.checkpt.java8.demo.references;

import com.checkpt.java8.demo.data.Student;
import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ClassLevelReference {

    private static BiConsumer<String,String> test = (s1,s2) -> System.out.println(s1+"\t"+s2);

    public static void main(String[] args) {
      Supplier<List<Student>>  supplier = StudentDataBase::getAllStudents;
      supplier.get().forEach(System.out::println);
      supplier.get().forEach(s-> System.out.println(s));
      test.accept("Name1", "Name2");
    }


}

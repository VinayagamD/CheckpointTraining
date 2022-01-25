package com.checkpt.java8.demo.streams;

import com.checkpt.java8.demo.data.Student;
import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("============= Name Sort ==================");
        students.stream().filter(Objects::nonNull).sorted(Comparator.comparing(Student::getName)).toList()
                .forEach(System.out::println);
        System.out.println("============= GPA Sort ==================");
        students.stream().filter(Objects::nonNull).sorted(Comparator.comparing(Student::getGpa).reversed()).toList()
                .forEach(System.out::println);
    }
}

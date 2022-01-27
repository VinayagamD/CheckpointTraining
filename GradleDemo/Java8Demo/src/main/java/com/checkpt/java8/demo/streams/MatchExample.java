package com.checkpt.java8.demo.streams;

import com.checkpt.java8.demo.data.Student;
import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.List;
import java.util.Objects;

public class MatchExample {
    private static boolean allMatch(List<Student> students, double gpa){
        return students.stream()
                .filter(Objects::nonNull)
                .allMatch(s -> s.getGpa() >= gpa);
    }

    private static boolean anyMatch(List<Student> students, double gpa){
        return students.stream()
                .filter(Objects::nonNull)
                .anyMatch(s -> s.getGpa() >= gpa);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Result of All Match "+allMatch(students,3.5));
        System.out.println("Result of All Match "+allMatch(students,4));
        System.out.println("Result of All Match "+allMatch(students,5));
        System.out.println("Result of Any Match "+anyMatch(students,3.8));
        System.out.println("Result of Any Match "+anyMatch(students,4));
        System.out.println("Result of Any Match "+anyMatch(students,5));
    }
}

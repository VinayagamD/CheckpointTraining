package com.checkpt.java8.demo.streams;

import com.checkpt.java8.demo.data.Student;
import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindExample {

    private static Optional<Student> findAnyStudent(List<Student> students, double gpa){
        return students.stream()
                .filter(Objects::nonNull)
                .filter(s -> s.getGpa() > gpa)
                .findAny();
    }

    private static Optional<Student> findAnyFirst(List<Student> students, double gpa){
        return students.stream()
                .filter(Objects::nonNull)
                .filter(s -> s.getGpa() > gpa)
                .findFirst();
    }

    private static boolean noneMatch(List<Student> students, double gpa){
        return students.stream()
                .filter(Objects::nonNull)
                .noneMatch(s -> s.getGpa() > gpa);
    }


    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Find Any");
        Optional<Student> studentOptionalFindAny = findAnyStudent(students,3.9);
        if(studentOptionalFindAny.isPresent()){
            System.out.println("StudentFound = "+studentOptionalFindAny.get());
        } else {
            System.out.println("Student Not Found");
        }
        studentOptionalFindAny = findAnyStudent(students,5);
        if(studentOptionalFindAny.isPresent()){
            System.out.println("StudentFound = "+studentOptionalFindAny.get());
        } else {
            System.out.println("Student Not Found");
        }

        System.out.println("Find First");
        studentOptionalFindAny = findAnyFirst(students,3.9);
        if(studentOptionalFindAny.isPresent()){
            System.out.println("StudentFound = "+studentOptionalFindAny.get());
        } else {
            System.out.println("Student Not Found");
        }
        studentOptionalFindAny = findAnyFirst(students,5);
        if(studentOptionalFindAny.isPresent()){
            System.out.println("StudentFound = "+studentOptionalFindAny.get());
        } else {
            System.out.println("Student Not Found");
        }
        System.out.println(noneMatch(students,3.9));
        System.out.println(noneMatch(students,5));
    }
}

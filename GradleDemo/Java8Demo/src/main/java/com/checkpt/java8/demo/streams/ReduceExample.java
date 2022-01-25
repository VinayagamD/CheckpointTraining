package com.checkpt.java8.demo.streams;

import com.checkpt.java8.demo.data.Student;
import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReduceExample {

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        Optional<Student> student = students.stream().filter(Objects::nonNull).reduce(BinaryOperator.maxBy(Comparator.comparing(Student::getGpa)));
        if (student.isPresent()){
            System.out.println(student.get());
        } else {
            System.out.println("Not found");
        }
    }
}

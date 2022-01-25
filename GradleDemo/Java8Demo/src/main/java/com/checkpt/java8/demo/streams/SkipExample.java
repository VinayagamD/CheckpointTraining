package com.checkpt.java8.demo.streams;

import com.checkpt.java8.demo.data.Student;
import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.List;

public class SkipExample {

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("============= Before Skip ===============");
        students.forEach(System.out::println);
        System.out.println("============= After Skip ===============");
        students.stream().skip(2).forEach(System.out::println);
    }
}

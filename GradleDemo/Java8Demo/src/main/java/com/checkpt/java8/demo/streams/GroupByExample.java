package com.checkpt.java8.demo.streams;

import com.checkpt.java8.demo.data.Student;
import com.checkpt.java8.demo.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupByExample {

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        Map<String,List<Student>> genderGroup =
                students.stream().filter(Objects::nonNull)
                        .collect(Collectors.groupingBy(Student::getGender));
        genderGroup.forEach((k,v) -> {
            System.out.println("Key = "+k+" : Value = "+v);
        });

        List<Student> students1 = new ArrayList<>();
        Student student = new Student("Test1");
        Student student1 = new Student("Test1");
        Student student2 = new Student("Test2");
        Student student3 = new Student("Test2");

    }
}

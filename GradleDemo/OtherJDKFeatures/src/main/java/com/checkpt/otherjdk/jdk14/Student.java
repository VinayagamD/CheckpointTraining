package com.checkpt.otherjdk.jdk14;

public record Student(String name, int age) {

    public static void main(String[] args) {
        Student student = new Student("Test", 20);
        System.out.println(student.name());
        System.out.println(student.age());
    }
}

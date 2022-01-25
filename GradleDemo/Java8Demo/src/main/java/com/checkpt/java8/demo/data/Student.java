package com.checkpt.java8.demo.data;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student implements Comparable<Student>{
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activites = new ArrayList<>();
    private int noteBooks;
    private Optional<Bike> bike = Optional.empty();

    public Student(String name, int gradeLevel, double gpa, String gender,List<String> activites) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activites = activites;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activites, int noteBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activites = activites;
        this.noteBooks = noteBooks;
    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printListOfActivites(){
        System.out.println(activites);
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public List<String> getActivites() {
        return activites;
    }

    public void setActivites(List<String> activites) {
        this.activites = activites;
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activites=" + activites +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student s) {
        int i = Double.compare(this.gpa,s.gpa);
        if (i!=0)
            return i;
        i = this.name.compareTo(s.name);
        if (i!=0)
            return i;
        return  Integer.compare(this.gradeLevel,s.gradeLevel);
    }
}

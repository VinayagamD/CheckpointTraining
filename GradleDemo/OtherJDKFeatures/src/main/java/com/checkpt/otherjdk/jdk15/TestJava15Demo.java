package com.checkpt.otherjdk.jdk15;

public class TestJava15Demo {

    public static void main(String[] args) {
        String tuesday = "Tuesday";

        String data = switch (tuesday) {
            case "Monday" -> "Today is monday";
            case "Tuesday" -> "Today is Tuesday";
            default -> "Wrong day has been supplied";
        };
        System.out.println(data);
    }
}

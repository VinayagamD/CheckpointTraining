package com.checkpt.java8.demo;

import com.checkpt.java8.demo.interfaces.TestInterface;
import com.checkpt.java8.demo.interfaces.TestInterface2;

import java.util.concurrent.ThreadLocalRandom;

public class Java8Intro {

    public static void main(String[] args) {

        // Function Interface Example with no param
        TestInterface testInterface = new TestInterface() {
            @Override
            public void testFunction() {
                System.out.println("Test Function Old Style");
            }
        };

        TestInterface testInterface1 = () -> {
            System.out.println("Lamda function");
        };

        testInterface.testFunction();
        testInterface1.testFunction();

        // Function Interface Example with  param

        // Old Style
        TestInterface2 testInterface2a = new TestInterface2() {
            @Override
            public void testFunction(int data) {
                System.out.println(data);
            }
        };

        // Lambda approach
        TestInterface2 testInterface2b = data ->  {
            System.out.println(data);
        };

        // Lambda approach with method reference
        TestInterface2 testInterface2c = System.out::println;

        // Method should not be used in this case : Since additional modification is involved
        TestInterface2 testInterface2 =  data -> {
            System.out.println("Test Data passed "+data);
        };

        // Data should be immutable
        int testData = ThreadLocalRandom.current().nextInt(100,1000);
        testInterface2.testFunction(testData);
        testInterface2a.testFunction(testData);
        testInterface2b.testFunction(testData);

        testData = 30;
        System.out.println(testData);



    }
}

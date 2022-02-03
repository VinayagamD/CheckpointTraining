package com.vinaylogics.junit5demo;

import org.junit.jupiter.api.*;

public class LifeCycleTest {

    @BeforeAll
    public static void overAllSetup(){
        System.out.println("=============== Junit 4 ===========");
        System.out.println("================== @BeforeClass ===========");
        System.out.println("=============== Junit 5 ===========");
        System.out.println("================== @BeforeAll ===========");
        System.out.println();
    }

    @BeforeEach
    public void setUp(){
        System.out.println("=============== Junit 4 ===========");
        System.out.println("================== @Before ===========");
        System.out.println("=============== Junit 5 ===========");
        System.out.println("================== @BeforeEach ===========");
    }

    @Test
    @DisplayName("This is to display testing of test method1")
    public void testMethod1(){
        System.out.println();
        System.out.println("Test Method1");
        System.out.println();
    }

    @Test
    @DisplayName("This is to display testing of test method2")
    public void testMethod2(){
        System.out.println("Test Method2");
    }

    @RepeatedTest(10)
    public void testMethodRepeat(){
        System.out.println("Repeat test");
    }

    @RepeatedTest(10)
    public void testMethodRepeatWithInfo(RepetitionInfo repetitionInfo){
        System.out.println("Repetition Info current count " +repetitionInfo.getCurrentRepetition() + " out of "+repetitionInfo.getTotalRepetitions());
        System.out.println("Repeat test");
    }

    @RepeatedTest(value = 10, name ="Current method run {currentRepetition}" )
    public void testMethodRepeatWithDocumentation(RepetitionInfo repetitionInfo){
        System.out.println("Repetition Info current count " +repetitionInfo.getCurrentRepetition() + " out of "+repetitionInfo.getTotalRepetitions());
        System.out.println("Repeat test");
    }


    @AfterEach
    public void clean(){
        System.out.println("=============== Junit 4 ===========");
        System.out.println("================== @After ===========");
        System.out.println("=============== Junit 5 ===========");
        System.out.println("================== @AfterEach ===========");
        System.out.println();
    }

    @AfterAll
    public static void overAllClean(){
        System.out.println();
        System.out.println("=============== Junit 4 ===========");
        System.out.println("================== @AfterClass ===========");
        System.out.println("=============== Junit 5 ===========");
        System.out.println("================== @AfterAll ===========");
    }
}

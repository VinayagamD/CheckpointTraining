package com.checkpt.java8.demo.interfaces;

@FunctionalInterface
public interface TestInterface2 {

    void testFunction(int data);
//    void test1Function();

    private void testPrivate(){
        System.out.println("Test Private Function");
    }

    default void testDefault(){
        System.out.println("Test Private Function");
    }

    static void testStaticMethod(){
        System.out.println("Test Static Method");
    }

}

package com.checkpt.java8.demo.data;

public class DataSingleton {

    private static  DataSingleton instance;

    public static DataSingleton getInstance() {
        if(instance == null){
            instance = new DataSingleton();
        }

        return instance;
    }
}

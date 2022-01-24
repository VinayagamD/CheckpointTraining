package com.checkpt.java8.demo.data;

public class DataNotException extends RuntimeException{

    public DataNotException() {
        super("Expected Data Exception");
    }

    public DataNotException(String message) {
        super(message);
    }
}

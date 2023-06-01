package com.scaler.lld.exception_handling.custom_exceptions;

public class MyCustomException extends Exception{

    public MyCustomException() {
        super();
    }

    public MyCustomException(String message){
        super(message);
    }
}

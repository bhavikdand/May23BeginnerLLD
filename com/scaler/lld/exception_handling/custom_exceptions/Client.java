package com.scaler.lld.exception_handling.custom_exceptions;

public class Client {

    public static void main(String[] args) {
        int num = 60;
        try {
            call(num);
        } catch (MyCustomException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage() + " " + "I am normal Exception");
        } finally{
            System.out.println("Everything is good at the end");
        }

        try {
            call(num);
        } catch(Exception e){
            System.out.println(e.getMessage() + " " + "I am normal Exception");
        } finally{
            System.out.println("Everything is good at the end");
        }
    }

    public static void call(int n) throws MyCustomException, Exception{

        if(n > 50){
            throw new Exception("Num cannot be greater than 50, throwing Exception");
        }
        if(n > 25){
            throw new MyCustomException("Num is greater than 25, throwing myCustomException");
        }
        System.out.println("Everything is good, no execption");
    }
}

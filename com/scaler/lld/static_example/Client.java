package com.scaler.lld.static_example;

public class Client {


    public static void main(String[] args) {
        System.out.println(Student.uniName);
    }
}

class Student{
    public static String uniName = "LPU";
    public int id;
    public String name;
}

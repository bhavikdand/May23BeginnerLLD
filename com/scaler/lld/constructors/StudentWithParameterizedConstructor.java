package com.scaler.lld.constructors;

public class StudentWithParameterizedConstructor {

    private int age;
    public String name;
    public String email;

    public StudentWithParameterizedConstructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    public StudentWithParameterizedConstructor(int age, String email){
        this.email = email;
        this.age = age;
    }
}

package com.scaler.lld.intro_to_oops;

public class Student {

    int age;
    String name;
    float psp;

    void printStudent(){
        System.out.println("Name: " + name + ", age: " + age + ", psp: " + psp + ".");
    }

    void pauseCourse(){
        System.out.println(name + " has paused course");
    }
}

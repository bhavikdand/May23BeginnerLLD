package com.scaler.lld.intro_to_access_modifiers.package_1;

public class Student {

    private int age;
    public  String name;
    float psp;

    protected String email;

    public void printStudent(){
        System.out.println("Name: " + name + ", age: " + age + ", psp: " + psp + ".");
    }

    private void pauseCourse(){
        System.out.println(name + " has paused course");
        System.out.println(age + " " + email);
    }
}

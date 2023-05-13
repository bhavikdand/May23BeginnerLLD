package com.scaler.lld.constructors.copy;

public class Student {

    String name;
    University uni;

    public Student(String name, University uni){
        this.name = name;
        this.uni = uni;
    }
    public Student(){

    }

    public Student(Student original){
        this.name = original.name;
        //this.uni = original.uni;
        this.uni = new University(original.uni.name); // This will create a deep copy
    }
}

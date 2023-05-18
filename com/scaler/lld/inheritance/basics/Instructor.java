package com.scaler.lld.inheritance.basics;

public class Instructor extends User{

    public String batchName;
    public double avgRating;

    public void scheduleClass(){
        System.out.println("Instructor is scheduling class");
    }
}

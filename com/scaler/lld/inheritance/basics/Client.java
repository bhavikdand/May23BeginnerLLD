package com.scaler.lld.inheritance.basics;

public class Client {

    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.batchName = "Aug 22 Beginner";
        i.login();
        i.username = "Bhavik";
        i.scheduleClass();
    }
}

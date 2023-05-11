package com.scaler.lld.intro_to_oops;

public class Client {

    public static void main(String[] args) {
        Student bhavik = new Student();
        bhavik.name = "Bhavik";
        bhavik.age = 26;
        bhavik.psp = 99.999999f;

        Student devesh = new Student();
        devesh.name = "Devesh";
        devesh.age = 25;
        devesh.psp = 100;

        bhavik.pauseCourse();
        devesh.printStudent();
    }
}

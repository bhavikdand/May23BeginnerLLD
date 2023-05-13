package com.scaler.lld.constructors.copy;

public class Client {

    public static void main(String[] args) {
        University u = new University("LPU");
        Student s = new Student("Bhavik", u);
        Student copy = new Student(s);
        System.out.println(copy.uni.name);
        System.out.println(s.uni.name);
        s.uni.name = "Scaler";
        System.out.println("---------------------");
        System.out.println(copy.uni.name);
        System.out.println(s.uni.name);

    }
}

package com.scaler.lld.static_example;

public class Client {


    public static void main(String[] args) {
        System.out.println(Student.uniName);

        Student.getStudent();
        Student.someStaticMethod();

        Student s1 = new Student();
        s1.name = "Bhavik";
        s1.id = 1;
        s1.printName();

        Student s2 = new Student();
        s2.name = "Pritam";
        s2.id = 2;
        s2.printNameFancy();
    }
}

class Student{
    public static String uniName = "LPU";
    public int id;
    public String name;

    public void printName(){
        System.out.println(this.name);
        someStaticMethod();
    }

    public void printNameFancy(){
        System.out.println("*****" + this.name + "*******");
        printName();
        getStudent();
    }

    public static Student getStudent(){
//        printName();  <- Non static/ instance methods cannot be called from static method
        someStaticMethod();
        return new Student();
    }

    public static void someStaticMethod(){
        System.out.println("I am some static method");
    }
}

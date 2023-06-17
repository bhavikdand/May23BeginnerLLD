package com.scaler.lld.design_patterns.prototype;

public class Student  implements CloneableStudent{

    private String email;
    public String name;
    private int age;
    public String universityName;

    public Student(String email, String name, int age, String universityName) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.universityName = universityName;
    }

    public Student(Student original){
        this.name = original.name;
        this.email = original.email;
        this.age = original.age;
        this.universityName = original.universityName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}

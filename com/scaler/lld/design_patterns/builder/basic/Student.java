package com.scaler.lld.design_patterns.builder.basic;

import java.util.Date;

public class Student {

    String name;
    String email;
    String phone;
    String universityName;

    int age;
    int gradYear;

    Date dob;  // <- Optional attribute

    public Student(Builder builder) throws Exception {
        if(builder.age < 18){
            throw new Exception("Age cannot be less than 18");
        }
        this.age = builder.age;
        this.name = builder.name;
        this.email = builder.email;
        this.gradYear = builder.gradYear;
        this.phone = builder.phone;
        this.universityName = builder.universityName;
        this.dob = builder.dob;
    }

}

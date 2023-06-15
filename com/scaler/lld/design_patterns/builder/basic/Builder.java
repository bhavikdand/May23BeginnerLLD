package com.scaler.lld.design_patterns.builder.basic;

import java.util.Date;

public class Builder {
    String name;
    String email;
    String phone;
    String universityName;

    int age;
    int gradYear;



    Date dob;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}

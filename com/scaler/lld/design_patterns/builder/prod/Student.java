package com.scaler.lld.design_patterns.builder.prod;


import java.util.Date;

public class Student {

    String name;
    String email;
    String phone;
    String universityName;

    int age;
    int gradYear;

    Date dob;  // <- Optional attribute

    private Student(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.email = builder.email;
        this.gradYear = builder.gradYear;
        this.phone = builder.phone;
        this.universityName = builder.universityName;
        this.dob = builder.dob;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder {
        String name;
        String email;
        String phone;
        String universityName;

        int age;
        int gradYear;



        Date dob;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setDob(Date dob) {
            this.dob = dob;
            return this;
        }

        public Student build() throws Exception{
            // we can do validations here
            if(this.age < 18){
                throw new Exception("Age is less than 18");
            }
            return new Student(this);

        }
    }
}

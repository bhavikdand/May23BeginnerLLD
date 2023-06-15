package com.scaler.lld.design_patterns.builder.prod;

import java.util.Date;

public class Client {

    public static void main(String[] args) throws Exception {

        Student.Builder sb = Student.getBuilder()
                .setAge(25)
                .setDob(new Date())
                .setUniversityName("LPU")
                .setEmail("test@scaler.com")
                .setPhone("13234234");

//        sb.setAge(24);
//        sb.setEmail("test@Scaler.com");
//        sb.setName("John doe");
//        sb.setPhone("13234234");

        // Student st = new Student(sb);  <- because student's constructor is private

        Student s = Student.getBuilder()
                .setAge(24)
                .setName("Bhavik")
                .setGradYear(2018)
                .build();

    }
}

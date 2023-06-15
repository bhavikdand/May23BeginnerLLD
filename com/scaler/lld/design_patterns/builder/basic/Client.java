package com.scaler.lld.design_patterns.builder.basic;

import java.util.Date;

public class Client {

    public static void main(String[] args) throws Exception {

        Builder builder = new Builder();
        builder.setAge(25);
        builder.setEmail("b@d.com");
        builder.setGradYear(2018);
        builder.setName("Bhavik1");
        builder.setPhone("1002034234");
        builder.setUniversityName("LPU");
        Student s1 = new Student(builder);

        builder = new Builder();
        builder.setAge(25);
        builder.setEmail("b@d.com");
        builder.setGradYear(2018);
        builder.setName("Bhavik2");
        builder.setPhone("1002034234");
        builder.setUniversityName("LPU");
        builder.setDob(new Date());
        Student s2 = new Student(builder);

        System.out.println("Debug");

    }
}

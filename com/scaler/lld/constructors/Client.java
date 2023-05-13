package com.scaler.lld.constructors;

public class Client {

    public static void main(String[] args) {
        StudentWithDefaultConstructor student = new StudentWithDefaultConstructor();

        student.name = "Bhavik";

        StudentWithNoDefaultConstructor st = new StudentWithNoDefaultConstructor();
        //System.out.println(st.name);

        StudentWithParameterizedConstructor st1 = new StudentWithParameterizedConstructor(26, "b@d.com");
        System.out.println(st1.name);
        System.out.println(st1.email);

    }
}

package com.scaler.lld.intro_to_access_modifiers.package_2;


import com.scaler.lld.intro_to_access_modifiers.package_1.Student;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name);

        // System.out.println(st.age); <- ERROR age is private
        // System.out.println(st.email); <-- ERROR different
        // package and not a child class

        // System.out.println(st.psp); <- ERROR: default has
        // package level access
    }
}

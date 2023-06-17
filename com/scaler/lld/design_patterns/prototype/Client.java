package com.scaler.lld.design_patterns.prototype;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        StudentRegistry studentRegistry = initializeAndGetRegistry();
        Student st = getPrototypeStudent(studentRegistry);

        Student clone = st.clone();
        System.out.println("DEBUG");
    }

    private static StudentRegistry initializeAndGetRegistry() {
        Student s = new Student("test@scaler.com", "John Doe", 20, "LPU");
        IntelligentStudent is = new IntelligentStudent("test@scaler.com", "John Doe", 20, "LPU", 200);
        StudentRegistry sr = new StudentRegistry();
        sr.register("NORMAL_STUDENT", s);
        sr.register("INTELLIGENT_STUDENT", is);
        return sr;
    }

    private static Student getPrototypeStudent(StudentRegistry studentRegistry) {
        Random random = new Random();
        int randomInt = random.nextInt();
        if(randomInt%2 == 0) {
            return studentRegistry.get("NORMAL_STUDENT");
        } else {
            return studentRegistry.get("INTELLIGENT_STUDENT");
        }
    }
}

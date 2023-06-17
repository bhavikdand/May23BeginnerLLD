package com.scaler.lld.design_patterns.prototype;

public class IntelligentStudent extends Student{

    private int iq;

    public IntelligentStudent(String email, String name, int age, String universityName, int iq) {
        super(email, name, age, universityName);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}

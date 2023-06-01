package com.scaler.lld.reflections;

public class Dummy {

    private int age;
    public String name;

    public Dummy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public void print(){
        System.out.println("I am in print:" + name + " " + age);
    }

    private void privatePrint(){
        System.out.println("I am in private print:" +name + " " + age);
    }

    public static void iAmAPublicStaticMethod(){
        System.out.println("I am a public static method");
    }

    private static void iAmAPrivateStaticMethod(){
        System.out.println("I am a private static method");
    }
}

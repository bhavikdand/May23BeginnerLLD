package com.scaler.lld.interface_example;

public class Main {

    public static void main(String[] args) {
//        Animal a = new Animal(); <- not allowed
        Animal a = new Dog();
        // a.name; <- This is also not allowed
        a.eat();
        a.walk();
        a.run();
    }
}

interface Animal{
    void eat();
    void walk();
    void run();
}

class Dog implements Animal{

    public String name;

    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
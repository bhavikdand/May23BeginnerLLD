package com.scaler.lld.generics.advanced_generics;

public class Animal {
    int legs;
    String name;

    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    public void walk(){
        System.out.println("Cat is walking");
    }

    public void meow(){
        System.out.println("Cat is meowing");
    }
}
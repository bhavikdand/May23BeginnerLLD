package com.scaler.lld.final_demo.class_demo;

public final class Animal { // <- If you mark a class final, we cannot do inheritance

    public int legs;
    public void eat(){
        System.out.println("Animal is eating");
    }
}

//class Dog extends Animal{
//
//    public void eat(){
//        System.out.println("Dog is eating");
//    }
//}

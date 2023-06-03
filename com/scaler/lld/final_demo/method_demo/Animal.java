package com.scaler.lld.final_demo.method_demo;

public class Animal {
    
    public int legs;
    public final void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

//    @Override
//    public void eat() {    <- Cannot override eat since eat is final in parent class
//        System.out.println("Dog is eating");
//    }
}
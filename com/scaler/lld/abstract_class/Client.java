package com.scaler.lld.abstract_class;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.age);
        System.out.println(a.name);
        a.walk();
        List<Integer> l = new ArrayList<>();
    }
}

abstract class Animal{
    String name;
    int age;
    void printName(){
        System.out.println("Name:" + name);
    }
     abstract void walk();
}

class Dog extends Animal{

    @Override
    void walk() {
        System.out.println("Dog is walking");
    }
}

abstract class A{
    int a;
    String s;
    public void print(){
        System.out.println("Printing");
    }
}


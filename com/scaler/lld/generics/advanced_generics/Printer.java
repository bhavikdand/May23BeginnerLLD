package com.scaler.lld.generics.advanced_generics;

public class Printer<T extends Animal> {
    T t;

    public Printer(T t){
        this.t = t;
    }

    public void print(){
        t.walk();
        System.out.println(t);
    }
}

package com.scaler.lld.polymorphism.runtime_polymorphism;

public class Example1 {

    public static void main(String[] args) {
        A a = new C();
        a.print();
        System.out.println("----------");
        a = new B();
        a.print();
        System.out.println("----------");
        a = new A();
        a.print();

    }
}

class A{
    void print(){
        System.out.println("A");
    }
}

class B extends A {
    void print(){
        super.print();
        System.out.println("B");
    }
}

class C extends B{
    void print(){
        System.out.println("C");
    }
}

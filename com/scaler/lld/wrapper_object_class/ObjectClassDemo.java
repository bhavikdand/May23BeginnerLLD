package com.scaler.lld.wrapper_object_class;

public class ObjectClassDemo {


    public static void main(String[] args) {
        Object obj = new Object();
        obj = new Integer(5);
        obj = new A();

    }
}

class A{
    int abc;
    public void print(){
        System.out.println(abc);
    }
}

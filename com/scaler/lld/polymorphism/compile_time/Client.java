package com.scaler.lld.polymorphism.compile_time;

public class Client {

    public static void main(String[] args) {
        Printer p = new Printer();

        p.print();
        p.print("Bhavik");
    }
}


class Calculator{

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return add(add(a,b), c);
    }
}
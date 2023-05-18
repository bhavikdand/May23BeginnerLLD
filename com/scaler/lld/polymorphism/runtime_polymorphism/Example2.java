package com.scaler.lld.polymorphism.runtime_polymorphism;

public class Example2 {

    public static void main(String[] args) {
        AA a = new CC();
        a.print();
        System.out.println("----------");
        a = new BB();
        a.print();
        System.out.println("----------");
        a = new AA();
        a.print();

    }
}

class AA{
    void print(){
        System.out.println("AA");
    }
}

class BB extends AA {

}

class CC extends BB{
    void print(){
        System.out.println("CC");
    }
}

package com.scaler.lld.generics.advanced_generics;

public class Client {

    public static void main(String[] args) {
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();

        shout("Hello all");
        shout(23);
        char a = shout('a');
        System.out.println("a=" + a);
    }

    public static <T> T shout(T content){
        System.out.println(content + "!!!!!!!!");
        return content;
    }
}

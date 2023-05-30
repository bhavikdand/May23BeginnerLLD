package com.scaler.lld.generics;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<String> p = new Printer<>("String");
        p.print();


    }
}

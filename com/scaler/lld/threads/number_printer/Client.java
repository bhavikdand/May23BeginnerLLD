package com.scaler.lld.threads.number_printer;

public class Client {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        Thread t = new Thread(np);
        t.start();
        System.out.println("I am in main thread");
    }
}

package com.scaler.lld.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai = new AtomicInteger();
        Adder a = new Adder(ai);

        Subtractor s = new Subtractor(ai);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ai.get());
        System.out.println(a.c.get());
        System.out.println(s.c.get());

    }
}

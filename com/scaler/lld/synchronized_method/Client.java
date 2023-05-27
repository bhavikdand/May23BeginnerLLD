package com.scaler.lld.synchronized_method;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Count c1 = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(c1);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.get());
        System.out.println(adder.count.get());
        System.out.println(subtractor.count.get());
    }
}

package com.scaler.lld.threads.basic;

public class Client {

    public static void main(String[] args) {
        BasicThread basicThread = new BasicThread();
        Thread t = new Thread(basicThread);
//        t.run();  //<- This is not going to create a new thread
        t.start();
        Thread t1 = new Thread(basicThread);
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}

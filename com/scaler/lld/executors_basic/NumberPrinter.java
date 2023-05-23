package com.scaler.lld.executors_basic;

public class NumberPrinter implements Runnable{

    int num;
    public NumberPrinter(int n){
        this.num = n;
    }

    @Override
    public void run() {
        System.out.println("Printing " + this.num + " from thread:" + Thread.currentThread().getName());
    }
}

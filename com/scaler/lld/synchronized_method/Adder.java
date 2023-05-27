package com.scaler.lld.synchronized_method;

public class Adder implements Runnable{

    Count count;
    public Adder(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=0;i<10000; i++){
            //lock.lock() or creating a synchronized block
            this.count.incrementValue(i);
            //lock.unlock or ending a synchronized block
        }
    }
}

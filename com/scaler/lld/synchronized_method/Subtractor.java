package com.scaler.lld.synchronized_method;

public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000; i++){
            //lock.lock() or sync block start
            this.count.decrementValue(i);
            //lock.unlock or sync block end
        }

    }

    public void printSomething(){

    }
}

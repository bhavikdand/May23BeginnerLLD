package com.scaler.lld.synchronized_method;

public class Count {

    int num;

    public synchronized void incrementValue(int offset){
        this.num += offset;
    }

    public synchronized void decrementValue(int offset){
        this.num -= offset;
    }

    public int get(){
        return this.num;
    }
}

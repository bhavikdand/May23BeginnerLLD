package com.scaler.lld.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Subtractor implements Runnable{
    AtomicInteger c;

    public Subtractor(AtomicInteger c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            this.c.decrementAndGet();
        }
    }
}

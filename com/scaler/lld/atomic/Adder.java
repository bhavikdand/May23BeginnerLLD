package com.scaler.lld.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Adder  implements Runnable{
    AtomicInteger c;

    int num;

    public Adder(AtomicInteger c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            this.c.incrementAndGet();
        }
    }
}

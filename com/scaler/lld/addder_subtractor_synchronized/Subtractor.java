package com.scaler.lld.addder_subtractor_synchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count c;
    public Subtractor(Count c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            synchronized (this.c) {
                this.c.num -= 1;
            }
        }
    }
}

package com.scaler.lld.addder_subtractor_synchronized;

import java.util.concurrent.locks.Lock;

public class Adder  implements Runnable{
    Count c;

    public Adder(Count c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            synchronized (this.c) {  // lock.lock()
                this.c.num += 1;
            } // lock.unlock()
        }
    }
}

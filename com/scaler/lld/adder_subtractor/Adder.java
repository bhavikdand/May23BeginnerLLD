package com.scaler.lld.adder_subtractor;

public class Adder  implements Runnable{
    Count c;

    int num;

    public Adder(Count c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            this.c.num += 1;
        }
    }
}

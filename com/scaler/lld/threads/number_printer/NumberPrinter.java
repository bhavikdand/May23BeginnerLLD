package com.scaler.lld.threads.number_printer;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        // Make an api call to start streaming call
        for(int i=0; i<100; i++){
            System.out.println(i+1);
        }
    }
}

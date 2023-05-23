package com.scaler.lld.executors_basic;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i=0; i<20; i++){
            NumberPrinter np = new NumberPrinter(i);
            service.execute(np);
        }
        service.shutdown();
    }
}

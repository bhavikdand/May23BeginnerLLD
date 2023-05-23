package com.scaler.lld.callable.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        RandomNumberGenerator rg = new RandomNumberGenerator();
        Future<Integer> submit = service.submit(rg);

        try {
            System.out.println("Now waiting for task to complete");
            int num = submit.get();
            System.out.println("Received " + num +" from thread pool");
        } catch (Exception e){
            System.out.println("Exception while get()");
        }
        service.shutdown();
    }
}

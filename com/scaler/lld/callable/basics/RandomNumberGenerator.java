package com.scaler.lld.callable.basics;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println("Number generated:" + num + ", sleeping now");
        try {
            Thread.sleep(num * 1000L);
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
        return num;
    }
}

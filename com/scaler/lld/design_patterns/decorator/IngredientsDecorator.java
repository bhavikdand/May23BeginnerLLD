package com.scaler.lld.design_patterns.decorator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class IngredientsDecorator implements Ingredients {
    Ingredients baseIcecream;

    public IngredientsDecorator(Ingredients baseIcecream) {
        this.baseIcecream = baseIcecream;
    }

    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I am in a thread");
//            }
//        });
        Thread t = new Thread(() -> System.out.println("I am in a thread"));
        t.start();

//        Thread t1 = new Thread(() -> {
//            for(int i=0;i < 100; i++){
//                System.out.println(i);
//            }
//        });
//        t1.start();

        List<Integer> list = Arrays.asList(1,2,4,45,23,4,3,4,2,3,4,5,6,7,8, 450,4504);

        ABC abc = new ABC() {
            @Override
            public void t1() {
                System.out.println("T1");
            }
            @Override
            public void t2() {
                System.out.println("T2");
            }
        };
        abc.t1();
        abc.t2();

        List<Integer> s = Arrays.asList(1,3,4,5,6,4,4,3,2,5,6,5).parallelStream()
                .map(x -> x *2)
                .collect(Collectors.toList());
        System.out.println(s);

    }

    public static void printit(Integer s){
        System.out.println(s);
    }

}

interface ABC{
    void t1();
    void t2();
}

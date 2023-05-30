package com.scaler.lld.collections_demo;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // list.add("String");  <- Because of type checking via Generics
        list = Arrays.asList(1,23,45,-28,-45,234,45546,546);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("After shuffling");
        System.out.println(list);

        int index = Collections.binarySearch(list, 45);
        System.out.println("Index:" + index);
    }
}

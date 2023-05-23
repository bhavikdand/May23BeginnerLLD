package com.scaler.lld.callable.merge_sort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,7,6,5,4,3,2,1);
        ExecutorService service = Executors.newCachedThreadPool();
        MergeSort mergeSort = new MergeSort(list, service);
        Future<List<Integer>> futureSortedArr = service.submit(mergeSort);

        try {
            List<Integer> sortedArr = futureSortedArr.get();
            System.out.println("Final sorted array" + Arrays.toString(sortedArr.toArray()));
        } catch (Exception e){
            System.out.println("Exception with get");
        }
        service.shutdown();
    }
}

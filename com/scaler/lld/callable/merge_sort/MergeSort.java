package com.scaler.lld.callable.merge_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    List<Integer> numbersToSort;
    ExecutorService service;

    public MergeSort(List<Integer> numbersToSort, ExecutorService service){
        this.numbersToSort = numbersToSort;
        this.service = service;
    }
    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Thread:" + Thread.currentThread().getName() + ": numbersToSort:" + Arrays.toString(numbersToSort.toArray()));
        if(numbersToSort.size() <= 1){
            return numbersToSort;
        }
        int mid = numbersToSort.size() / 2;
        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for(int i=0; i<mid; i++){
            leftArr.add(numbersToSort.get(i));
        }

        for(int i=mid; i<numbersToSort.size(); i++){
            rightArr.add(numbersToSort.get(i));
        }

        MergeSort leftMergeSort = new MergeSort(leftArr, service);
        MergeSort rightMergeSort = new MergeSort(rightArr, service);

        Future<List<Integer>> futureLeftArr = service.submit(leftMergeSort);
        Future<List<Integer>> futureRightArr = service.submit(rightMergeSort);

        leftArr = futureLeftArr.get();
        rightArr = futureRightArr.get();

        List<Integer> mergedList = new ArrayList<>();
        int i=0, j=0;

        while(i<leftArr.size() && j < rightArr.size()){
            if(leftArr.get(i) > rightArr.get(j)){
                mergedList.add(rightArr.get(j));
                j++;
            } else {
                mergedList.add(leftArr.get(i));
                i++;
            }
        }

        while(i<leftArr.size()){
            mergedList.add(leftArr.get(i));
            i++;
        }

        while(j<rightArr.size()){
            mergedList.add(rightArr.get(j));
            j++;
        }
        return mergedList;
    }
}

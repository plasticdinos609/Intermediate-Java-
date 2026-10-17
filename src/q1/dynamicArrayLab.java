package q1;
import java.util.ArrayList;

import Algorithms.SortingAlgorithm;
import dataStructures.DynamicArray;

public class dynamicArrayLab {
    public static void main(String[] args) {
        System.out.println("========== Dynamic Array ==========");
        var dArray = new DynamicArray<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < 100_000; i++)
            dArray.add((int)(Math.random() * 100_000));
        long end = System.nanoTime();
        System.out.println("Dynamic Array add: " + (end-start)/1e6 + " ms");  // ns to ms

        start = System.nanoTime();
        dArray.sort();
        end = System.nanoTime();
        System.out.println("Dynamic Array sort: " + (end-start)/1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 100_000; i++)
            dArray.remove(0);
        end = System.nanoTime();
        System.out.println("Dynamic Array remove: " + (end-start)/1e6 + " ms");
 
        System.out.println("=========== Array  List ===========");
        var ArrayL = new ArrayList<Integer>();

        long begin = System.nanoTime();
        for (int i = 0; i < 100_000; i++)
            ArrayL.add((int)(Math.random() * 100_000));
        long quit = System.nanoTime();
        System.out.println("Dynamic Array add: " + (quit-begin)/1e6 + " ms");  // ns to ms

        begin = System.nanoTime();
        int looper=0;
        var arr = new Integer[ArrayL.size()];
            for(var n : ArrayL){
                arr[looper++] = n;
            }
        SortingAlgorithm.insertionSort(arr);
        quit = System.nanoTime();
        System.out.println("Dynamic Array sort: " + (quit-begin)/1e6 + " ms");

        begin = System.nanoTime();
        for (int i = 0; i < 100_000; i++)
            ArrayL.remove(0);
        quit = System.nanoTime();
        System.out.println("Dynamic Array remove: " + (quit-begin)/1e6 + " ms");
    
        }
}
/*
========== Dynamic Array ==========
Dynamic Array add: 13.827698 ms
Dynamic Array sort: 22143.932949 ms
Dynamic Array remove: 30173.157847 ms
=========== Array  List ===========
Dynamic Array add: 10.256648 ms
Dynamic Array sort: 17907.837409 ms
Dynamic Array remove: 360.475425 ms
 */
package q1;

import java.util.ArrayList;

import Algorithms.SortingAlgorithm;

public class selectionsort {
   //FIX ME LATER
    public static void main(String[] args) {
        var ArrayL = new ArrayList<Integer>();
        for (int i = 0; i < 27; i++) {
            ArrayL.add((int) (Math.random() * 100));
            System.out.print(ArrayL.get(i) + " ");
        }

        int looper = 0;
        var arr = new Integer[ArrayL.size()];
        for (var n : ArrayL) {
            arr[looper++] = n;
        }

        System.out.println();
        SortingAlgorithm.selectionSort(arr);
        for (int i = 0; i < ArrayL.size(); i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

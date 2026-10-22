package q1;
import Algorithms.SortingAlgorithm;

public class bluePelican401 {

    public static void main(String args[]) {
        int theArray[] = { 4, 2, 5, 1, 3, 18, 0, 9, 6 };
        int looper=0;
        var arr = new Integer[theArray.length];
        for (var n : theArray) {
            arr[looper++] = n;
        }
        SortingAlgorithm.bubbleSort(arr);
        //SortingAlgorithm.insertionSort(arr);
        //SortingAlgorithm.selectionSort(arr);
        
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
    } 
    /*
    unsorted: 
    4 2 5 1 3 18 0 9 6
    bubble sort: 
    0 1 2 3 4 5 6 9 18  
    insertion sort: 
    0 1 2 3 4 5 6 9 18  
    selection sort:
    0 1 2 3 4 5 6 9 18  
    */

    

}

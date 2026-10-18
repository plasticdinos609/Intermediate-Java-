package Algorithms;

public class SortingAlgorithm {
    public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0)
                    swap(arr, j, j + 1);
    }

    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        insertionSort(arr, arr.length);
    }

    public static <T extends Comparable<T>> void insertionSort(T[] arr, int n) {
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        //FIX ME LATER
        String[] pos = new String[2];
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[x].compareTo(arr[x + 1]) > 0) {
                    pos[0] = "" + arr[x + 1];
                    pos[1] = "" + x;
                }
                T temp = arr[0];
                arr[0]= arr[Integer.parseInt(pos[1])];
                arr[Integer.parseInt(pos[1])]=temp;

            }

        }
    }

    public static <T extends Comparable<T>> void shellSort(T[] arr) {
        //DO LATER
    }
}

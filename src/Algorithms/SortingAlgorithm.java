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

        for (int x = 0; x < arr.length; x++) {
            int pos = x;
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[pos].compareTo(arr[y]) > 0) {
                    pos = y;
                }

            }
            T temp = arr[x];
            arr[x] = arr[(pos)];
            arr[(pos)] = temp;

        }
    }

    public static <T extends Comparable<T>> void shellSort(T[] arr) {
        int gap = arr.length / 2;
        while (gap >= 1) {
            for (int y = 0; y < arr.length - gap; y++) {
                int t = 0;
                while ((y - t >= 0) && arr[y - t].compareTo(arr[y + gap - t]) > 0) {
                    T temp = arr[y - t];
                    arr[y - t] = arr[y + gap - t];
                    arr[y + gap - t] = temp;
                    t += gap;
                }
            }
            gap /= 2;
        }
      
    }
}

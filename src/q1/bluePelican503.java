package q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import Algorithms.SearchAlgorithm;

public class bluePelican503 {
    public static void main(String[] args) {
        int i[] = { -7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97 };
        var nums = new ArrayList<Integer>();

       

        int looper = 0;
        var arr = new Integer[i.length];
         for (int x = 0; x < i.length; x++) {
            arr[x]=i[x];
        }

        int num = 0;
        var input = new Scanner(System.in);
        do {
            System.out.print("input a number to search for: ");
            num = input.nextInt();
            int pos = SearchAlgorithm.binarySearch(arr, num);
            System.out.println(
                    pos == -1 ? "number does not occur\n" : "your number occurs at index: " + (pos + 1) + "\n");

        } while (num != -1);
        input.close();

    }
}

package q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import Algorithms.SearchAlgorithm;

public class prog460a {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/sort.dat"));
            var nums = new ArrayList<Integer>();

            while (file.hasNext()) {
                nums.add(file.nextInt());

            }
            file.close();

            int looper = 0;
            var arr = new Integer[nums.size()];
            for(var n : nums){
                arr[looper++] = n;
            }

            int num =0;
            var input = new Scanner(System.in);

            do {
                System.out.print("input a number to search for: ");
                num = input.nextInt();
                int pos = SearchAlgorithm.binarySearchRecursive(arr, num);
                System.out.println(pos == -1? "number does not occur\n":"your number occurs at index: "+(pos+1)+"\n");

            }while (num!=-1);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

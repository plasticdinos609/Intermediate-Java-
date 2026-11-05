package q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class msoe2007prob8 {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/problem8.txt"));

            ArrayList<Integer> arrayL = new ArrayList<Integer>();
            while (file.hasNextInt()) {
                arrayL.add(file.nextInt());
            }
            int size = arrayL.size() / 3;

            int[][] arr = new int[size][3];
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < size; y++) {
                    arr[y][x] = arrayL.get(y + (size * x));
                    System.out.print(arr[y][x] + " ");
                }
                System.out.println();
            }
            System.out.print("the value of the tops are: ");

            for (int x = 1; x < 2; x++) {
                for (int y = 1; y < size - 1; y++) {
                    if (arr[y][x] >= arr[y - 1][x] && arr[y][x] >= arr[y + 1][x] &&
                            arr[y][x] >= arr[y][x - 1] && arr[y][x] >= arr[y][x + 1]) {
                        System.out.print(arr[y][x] + "  ");
                    }

                }
            }

            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
/*
1 1 2 3 4 5 
1 3 6 2 9 4 
2 3 4 6 6 7 
the value of the tops are: 6  9
*/
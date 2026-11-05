package q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class msoe2007prob9 {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/problem8.txt"));
            ArrayList<Integer> arrayL = new ArrayList<Integer>();
            int width = 2;
            while (file.hasNextInt()) {
                arrayL.add(file.nextInt());
            }
            int[] values = new int[5];
            for (int x = 0; x < arrayL.size(); x++) {
                if (arrayL.get(x) <= 1) {
                    values[0]++;
                } else if (arrayL.get(x) <= 3) {
                    values[1]++;
                } else if (arrayL.get(x) <= 5) {
                    values[2]++;
                } else if (arrayL.get(x) <= 7) {
                    values[3]++;
                } else if (arrayL.get(x) <= 9) {
                    values[4]++;
                }
            }

            for (int x = 0; x < 5; x++) {
                System.out.print((x * width) + "-" + (x * width + 1)+": ");
                for (int y = 0; y < values[x]; y++) {

                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
/*
0-1: ***
2-3: ******
4-5: ****
6-7: ****
8-9: *
*/

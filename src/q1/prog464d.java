package q1;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class prog464d {
    public static void main(String[] args) {
        try {
            var input = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] array = new int[4][4];
            System.out.println("original list: ");
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    array[x][y]=input.nextInt();
                    System.out.print(array[x][y]+"  ");
                }
                System.out.println();
            }
            System.out.println("transposed list: ");
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    System.out.print(array[y][x]+"  ");
                }
                System.out.println();
            }
        } catch (IOException e) {

        }

    }
}

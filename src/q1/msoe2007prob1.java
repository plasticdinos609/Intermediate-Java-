package q1;

import java.util.Scanner;

public class msoe2007prob1 {
    public static void main(String[] args) {
        int h1 = 0;
        int h2 = 0;
        int s1 = 0;
        int s2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first height: ");
        h1 = input.nextInt();
        System.out.print("enter the first length: ");
        s1 = input.nextInt();
        System.out.print("enter the second length: ");
        s2 = input.nextInt();

        if (h1 < 1 || s1 < 1 || s2 < 1) {
            System.out.println("Error: One or more values is equal to or less than 0. Please try again.");
        } else {
            h2 = (h1 / s1) * s2;
            System.out.println("The unknown height is: " + h2);
        }
        input.close();
    }

}

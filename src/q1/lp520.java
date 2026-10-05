package q1;

import java.util.Scanner;

public class lp520 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter text: ");
        String phrase = input.nextLine();
        int vowels = 0;
        String temp = phrase;
        while (temp.length() > 0) {
            if (temp.substring(0, 1).equals("a")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("e")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("i")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("o")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("u")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("A")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("E")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("I")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("O")) {
                vowels++;
            }
            if (temp.substring(0, 1).equals("U")) {
                vowels++;
            }
            temp = temp.substring(1);
        }
        System.out.println("number of vowels in " + phrase + " is " + vowels);
        input.close();
    }
}
/*
 * \
 * enter text: java programming assignment
 * number of vowels in java programming assignment is 8
 */
package q1;

import java.util.Scanner;

public class lp519 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("enter string: ");
        String str = input.nextLine();
        while (sentence.indexOf(str) > -1) {
            int begindex = sentence.indexOf(str);
            int endex = sentence.indexOf(str) + str.length() + 1;
            sentence = sentence.substring(0, begindex) + (sentence.substring(endex));
        }

        System.out.println(sentence);
        input.close();
    }
}
/*
 * Enter a sentence: i really hope you get an interview
 * enter string: really
 * i hope you get an interview
 */
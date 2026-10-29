package q1;

import java.util.Scanner;

public class msoe2007prob2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String phrase = input.nextLine();
        int vowels = 0;
        for (int x = 0; x < phrase.length(); x++) {
            if (phrase.split("")[x].equals("a") || phrase.split("")[x].equals("A")
                    || phrase.split("")[x].equals("e") || phrase.split("")[x].equals("E")
                    || phrase.split("")[x].equals("i") || phrase.split("")[x].equals("I")
                    || phrase.split("")[x].equals("o") || phrase.split("")[x].equals("O")
                    || phrase.split("")[x].equals("u") || phrase.split("")[x].equals("U")) {
                vowels++;
            }
        }
        System.out.println("the total number of vowels in '" + phrase + "' is " + vowels);
        input.close();
    }
}
/*
 * Please enter string: this sentence has eight vowels
 * the total number of vowels in 'this sentence has eight vowels' is 9
 */

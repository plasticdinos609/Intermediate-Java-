package q1;

import java.util.Scanner;

public class lp35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the amount of change in cents: ");
        int change = input.nextInt();
        int quarters = change / 25;
        change = change % 25;
        int dimes = change / 10;
        change = change / 10;
        int nickels = change / 5;
        change = change % 5;
        int pennies = change + 1;
        System.out.println("The least amount of coins used possible is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        input.close();

    }
}
/*
 * enter the amount of change in cents: 212
 * The least amount of coins used possible is:
 * Quarters: 8
 * Dimes: 1
 * Nickels: 0
 * Pennies: 2
 */

package q1;

import java.util.Scanner;

public class prog52a {
    public static void main(String[] args) {
        // int length =14;
        // int width =82
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = input.nextInt();
        System.out.print("Enter Width: ");
        int Width = input.nextInt();

        int area = length * Width;
        int perim = 2 * length + 2 * Width;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perim);

        input.close();
    }
}
/*
 * Enter Length: 5
 * Enter Width: 10
 * Area: 50
 * Perimeter: 30
 */
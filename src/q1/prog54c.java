package q1;

import java.util.Scanner;

public class prog54c {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("enter radius: ");
        double radius = input.nextDouble();
        final double pi = 3.14159;

        double area = pi * Math.pow(radius, 2);
        double circu = 2 * pi * radius;

        System.out.printf("area: %.3f/n", area);
        System.out.println();
        System.out.printf("circumference: %.3f/n", circu);
        input.close();
    }
}
//enter radius: 3.712
//area: 43.288
//circumference: 23.323
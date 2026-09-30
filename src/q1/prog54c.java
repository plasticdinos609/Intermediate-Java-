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

        System.out.println("area: " + area);
        System.out.println("circumference: " + circu);
        input.close();
    }
}

package q1;

import java.util.Scanner;

public class msoe2007prob3 {

    public static double sec(double in) {
        double out = in;
        out = Math.cos(out);
        String temp = "" + out;
        out = out * (Math.pow(10, temp.split("").length));
        out = (Math.pow(10, temp.split("").length)) / out;
        return out;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int side = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the three angles of the triangle, must add to 180: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        System.out.print("enter one side of the inscribed triangle: ");
        side = input.nextInt();
        if (a + b + c == 180) {
            Double r = side * Math.sin(a / 2) * Math.sin(b / 2) * sec(c / 2);
            System.out.println("The radius of the circle is: " + r);
        } else {
            System.out.println("Error: please enter angle values that add to 180");
        }
        input.close();
    }
}
/*
 * enter the three angles of the triangle, must add to 180: 60
 * 60
 * 60
 * enter one side of the inscribed triangle: 12
 * The radius of the circle is: 75.94403742090114
 */
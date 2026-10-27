package q1;

import java.io.*;
import java.util.*;

public class bluePelican378 {
    public static double findy(double m, double b, double x) {
        double y = m * x + b;
        return y;
    }

    public static double findx(double m, double b, double y) {
        double x = y / m + b;
        return x;
    }

    public static double getRoot(double m, double b) {
        double root = -b / m;
        return root;
    }

    public static void main(String args[]) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is the slope of your line? ");
        double slope = kbReader.nextDouble();
        System.out.print("What is the y-intercept of your line? ");
        double yIntc = kbReader.nextDouble();

        System.out.println("Slope of this line is: " + slope);
        System.out.println("Y-intercept of this line is: " + yIntc);
        System.out.println("Root of this line is: " + getRoot(slope, yIntc));
        System.out.print("\nWhat is an x value for which you wish to solve for y? ");
        double x = kbReader.nextDouble();
        double yValue = findy(slope, yIntc, x);
        System.out.println("The y value corresponding to x = " + x + " is " + yValue);
        System.out.print("\nWhat is a y value for which you wish to solve for x? ");
        double y = kbReader.nextDouble();
        double xValue = findx(slope, yIntc, y);
        System.out.println("The x value corresponding to y = " + y + " is " + xValue);
    }
}

/*
What is the slope of your line? -3
What is the y-intercept of your line? 2.5
Slope of this line is: -3.0
Y-intercept of this line is: 2.5
Root of this line is: 0.8333333333333334

What is an x value for which you wish to solve for y? -4.61
The y value corresponding to x = -4.61 is 16.330000000000002

What is a y value for which you wish to solve for x? 5
The x value corresponding to y = 5.0 is 0.8333333333333333
*/

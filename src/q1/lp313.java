package q1;

import java.util.*;


public class lp313 {

    public static void main(String[] args) {
        //var moneyformat = new DecimalFormat("$#,###.00");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the desired value:");
        int principle = input.nextInt();
        System.out.print("enter the number of years:");
        int years = input.nextInt();
        System.out.print("enter the interest:");
        double interest = input.nextDouble();
        System.out
                .println("the suggested principal is: " + (simpleinterest(principle, years, interest)));
input.close();
    }

    public static double simpleinterest(int princ, int year, double interest) {
        double value = princ / (1 + year * interest);
        return value;

    }
}
/*
enter the desired value:6500
enter the number of years:5
enter the interest:.06
the suggested principal is: 5000.0
*/
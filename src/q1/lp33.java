package q1;

import java.util.Scanner;

public class lp33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("books: $200\trent: $1,800/month\ttuition: $4,050/year\tmeals: $570/month\t");
        System.out.println();
        System.out.println("enter the amount/time for each of these items in the order listed above");
        int total = 0;
        total += input.nextInt() * 200;
        total += input.nextInt() * 1800;
        total += input.nextInt() * 4050;
        total += input.nextInt() * 570;
        System.out.println("enter the amount of your scholarships and grants in that order");
        for (int x = 0; x < 2; x++) {
            total -= input.nextInt();
        }
        System.out.println("your college total will be: $" + total);
        input.close();
    }
}
/*
 * books: $200 rent: $1,800/month tuition: $4,050/year meals: $570/month
 * enter the amount/time for each of these items in the order listed above
 * 12
 * 48
 * 4
 * 48
 * enter the amount of your scholarships and grants in that order
 * 22000
 * 1200
 * your college total will be: $109160
 */
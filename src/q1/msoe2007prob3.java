package q1;

import java.util.Scanner;

public class msoe2007prob3 {
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
        System.out.print("enter the opposite side of the side you are searching for: ");
        side = input.nextInt();
        if(a+b+c==180){
            Double r = side *Math.sin(a); //finish chud
        } else {
            System.out.println("Error: please enter angle values that add to 180");
        }
    }
}

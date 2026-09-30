package q1;

import java.util.Scanner;

public class lp510 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("enter 2 positive ints, separated by a space: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int temp = 0;

        while (num2>0){
            temp=num1%num2;
            num1=num2;
            num2=temp;
        }

        System.out.println("GCD equals "+ num1);
        input.close();
    }
}

//enter 2 positive ints, separated by a space: 40 32
//GCD equals 8

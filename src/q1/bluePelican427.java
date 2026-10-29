package q1;

import java.io.*;
import java.util.*;
import java.text.*;

public class bluePelican427 {

    public static void main(String[] args) {
        var ArrayL = new ArrayList<bankAccount>();
        Scanner input = new Scanner(System.in);
        String enter = "0";
        while (!enter.equals("exit")) {
            System.out.print("Please enter the name for whom the account belongs. ('exit' to quit): ");
            enter = input.nextLine();
            if (enter.equals("exit")){
                break;
            }
            System.out.print("Please enter the amount to deposit: ");
            double monay = Double.parseDouble(input.nextLine());
            bankAccount newaccount = new bankAccount(enter, monay);
            ArrayL.add(newaccount);
            enter = "0";
        }
        int maxpos = 0;
        for (int x = 0; x < ArrayL.size(); x++) {
            if (ArrayL.get(x).getBalance() > maxpos) {
                maxpos = x-1;
            }
        }
        System.out.println("The account with the highest balance belongs to: " + ArrayL.get(maxpos).getName());
        System.out.println("Their balance was: $" + ArrayL.get(maxpos).getBalance());
    }
}
/*
Please enter the name for whom the account belongs. ('exit' to quit): jim jones
Please enter the amount to deposit: 186.22

Please enter the name for whom the account belongs. ('exit' to quit): bill gates
Please enter the amount to deposit: 102.15

Please enter the name for whom the account belongs. ('exit' to quit): helen hunt
Please enter the amount to deposit: 1034.02

Please enter the name for whom the account belongs. ('exit' to quit): charles manson
Please enter the amount to deposit: 870.85

Please enter the name for whom the account belongs. ('exit' to quit): exit
The account with the highest balance belongs to: helen hunt
Their balance was: $1034.02
 */
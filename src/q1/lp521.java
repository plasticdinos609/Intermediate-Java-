package q1;

import java.util.Scanner;

public class lp521 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first name: ");
        String fstnm = input.nextLine();
        System.out.print("enter last name: ");
        String lstnm = input.nextLine();
        int group = 0;
        String a = "a";
        if (a.compareTo(lstnm.substring(0, 1)) < 9) {
            group = 1;
        } else if (a.compareTo(lstnm.substring(0, 1)) < 19) {
            group = 2;
        } else {
            group = 3;
        }

        System.out.println(fstnm + " " + lstnm + " is in group " + group);
        input.close();
    }

}
/*
enter first name: cris
enter last name: brig
cris brig is in group 1
*/
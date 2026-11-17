package q1.prog1060b;

import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;

public class prog1060b {
    public static void main(String[] args) {
        var file = new Scanner(System.in);
        Queue<Integer> list = new PriorityQueue<>();
        String str = "0";
        int enter = 0;
        
        while (!str.equals("E")) {
            System.out.print("Enter task A)dd, D)elete, E)xit ");
            str = file.next();
            if (str.equals("E")) {
                System.out.println("This is the list ");
                System.out.println(list);
            } else if (str.equals("A")) {
                System.out.print("enter number ");
                enter = file.nextInt();
                list.add(enter);
                System.out.println("This is the list ");
                System.out.println(list);
            } else if (str.equals("D")) {
                System.out.print("enter number ");
                enter = file.nextInt();
                if (list.contains(enter)) {
                    list.remove(enter);
                } else {
                    System.out.println("Number does not exit");
                }
                System.out.println("This is the list ");
                System.out.println(list);
            } else {
                System.out.println("Not a command. Try again.");
            }
            
        }

        file.close();
    }
}

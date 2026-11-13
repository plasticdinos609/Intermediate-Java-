package q1.prog602b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import dataStructures.Stack;

public class prog602b {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog602b.dat"));
            var stack = new Stack<Cl602b>();

            System.out.println("Account Number \tHours\tCode\tTotal");
            while (file.hasNext()) {
                int account = file.nextInt();
                double time = file.nextDouble();
                int code = file.nextInt();

                var sp = new Cl602b(account, time, code);
                stack.push(sp);
            }
            file.close();

            while (!stack.isEmpty()) {
                var sp = stack.pop();
                System.out.println(sp);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
/*Account Number  Hours   Code    Total
29118           15.02   0       $200.00
23051           1.55    2       $127.50
22841           27.90   2       $300.00
21352           5.84    0       $200.00
20045           5.00    1       $250.00
19111           12.00   2       $300.00
17185           7.93    1       $250.00
14063           17.06   1       $250.00
1825            3.25    0       $112.50 */
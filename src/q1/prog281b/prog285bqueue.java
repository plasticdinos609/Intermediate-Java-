package q1.prog281b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import dataStructures.queue;

public class prog285bqueue {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog285b.dat"));
            var queue = new queue<Cl285b>();

            System.out.println("Id\tCode\tSales\t\tCommission");
            while (file.hasNext()) {
                int id = file.nextInt();
                int c = file.nextInt();
                double s = file.nextDouble();

                var sp = new Cl285b(id, c, s);
                queue.enqueue(sp);
            }
            file.close();

            while (!queue.isEmpty()) {
                var sp = queue.dequeue();
                System.out.println(sp);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

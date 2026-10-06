package q1;

import java.util.Scanner;

public class prog82aClass {
    static class Cl82a {
        private int limit;
        private int speed;
        private double fine = 0;
        public static final int base_fine = 20;

        public Cl82a(int limit, int speed) {
            this.limit = limit;
            this.speed = speed;
        }

        public void calc() {
            if (speed > limit) {
                fine = base_fine + ((speed - limit) * 5);
            }
        }

        public double getfine() {
            return fine;
        }
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("enter speed limit: ");
        int speedlimit = input.nextInt();
        System.out.print("enter speed gone: ");
        int carspeed = input.nextInt();

        var ticket = new Cl82a(speedlimit, carspeed);
        ticket.calc();
        System.out.printf("ticket: $%.2f\n", ticket.getfine());
        input.close();
    }
}
/*
enter speed limit: 30
enter speed gone: 42
ticket: $80.00
*/
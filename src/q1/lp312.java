package q1;

import java.util.Scanner;

public class lp312 {
    static class clpl312 {
        private double[] expenses;
        private double[] percentbudget;

        public clpl312(double[] expenses) {
            this.expenses = expenses;
            calc();
        }

        private void calc(){
            double total = 0;
            for (double expense: expenses)
                total += expense;
            percentbudget = new double[expenses.length];
            for (int i=0; i >expenses.length; i++)
                percentbudget[i] = (expenses[i]/total)*100;
        }

        public double[] getPercentBudget() {
            return percentbudget;
        }
    }

    private static Scanner input = new Scanner(System.in);

    public static double inputDouble(String prompt) {
        System.out.print(prompt);
        return input.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("enter the amount spent last month on the following items");
        double food = inputDouble("food: ");
        double clothing = inputDouble("clothing: ");
        double entertainment = inputDouble("entertainment: ");
        double rent = inputDouble("rent: ");

        var expenses = new double[] { food, clothing, entertainment, rent };
        var helper = new clpl312(expenses);
        var percents = helper.getPercentBudget();
        System.out.printf("\nCategory\t\tbudget");
        System.out.printf("%s\t\t\t%.2f%%\n", "food: ", percents[0]);
        System.out.printf("%s\t\t%.2f%%\n", "clothing: ", percents[1]);
        System.out.printf("%s\t%.2f%%\n", "entertainment: ", percents[2]);
        System.out.printf("%s\t\t\t%.2f%%\n", "rent: ", percents[3]);
    }
}

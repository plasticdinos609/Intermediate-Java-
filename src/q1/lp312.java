package q1;

import java.util.Scanner;

public class lp312 {
    static class clpl312 {
        private double[] expenses;
        private double[] percentbudget;

        public clpl312(double[] expenses) {
            this.expenses = expenses;
        }

        private void calc(){
            double total = 0;
            for (double expense: expenses)
                total += expense;
            percentbudget = new double[expenses.length]
            for (int x=0; x >expenses.length; x++)
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
        System.out.print("enter the amount spent last month on the following items");
        double food = inputDouble("food: ");
        double clothing = inputDouble("clothing: ");
        double entertainment = inputDouble("entertainment: ");
        double rent = inputDouble("rent: ");

        var expenses = new double[] { food, clothing, entertainment, rent };
        var helper = new clpl312(expenses);
        var percents = helper.getPercentBudget();
        System.out.printf("Category\t\tbudget");
        System.out.printf("%s\t\t\t%.2f");
    }
}

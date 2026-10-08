package q1;

import java.util.Scanner;

public class LP312 {
    static class ClLP312 {
        private double[] expenses;
        private double[] percentBudget;

        public ClLP312(double[] expenses) {
            this.expenses = expenses;
            calc();
        }

        private void calc() {
            double total = 0;
            for (double expenses : expenses) {
                total += expenses;
            }
            percentBudget = new double[expenses.length];
            for (int x = 0; x < expenses.length; x++)
                percentBudget[x] = (expenses[x] / total) * 100;

        }

        public double[] getPercentBudget() {
            return percentBudget;
        }
    }

    private static Scanner input = new Scanner(System.in);

    public static double inputDouble(String prompt) {
        System.out.println(prompt);
        return input.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("Enter the amount spent last month on the following items ");
        double food = inputDouble("Food: ");
        double clothing = inputDouble("Clothing: ");
        double entertainment = inputDouble("Entertainment: ");
        double rent = inputDouble("Rent: ");

        var expenses = new double[] { food, clothing, entertainment, rent };
        var helper = new ClLP312(expenses);
        var percents = helper.getPercentBudget();

        System.out.println("Category\t\tBudget");
        System.out.printf("%s\t\t\t%.2f %%\n", "Food", percents[0]);
        System.out.printf("%s\t\t%.2f %%\n", "Clothing", percents[1]);
        System.out.printf("%s\t\t%.2f %%\n", "Entertainment", percents[2]);
        System.out.printf("%s\t\t\t%.2f %%\n", "Rent", percents[3]);
    }
}
// Enter the amount spent last month on the following items
// Food:
// 350
// Clothing:
// 300
// Entertainment:
// 200
// Rent:
// 1250
// Category Budget
// Food 16.67 %
// Clothing 14.29 %
// Entertainment 9.52 %
// Rent 59.52 %
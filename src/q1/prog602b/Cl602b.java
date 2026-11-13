package q1.prog602b;

public class Cl602b implements Comparable<Cl602b> {
    private int account;
    private int supercharge;
    private double hours;
    private double total;

    private void calc() {
        if (hours >= 5) {
            total = 200 + (supercharge * 50);
        } else if (hours <= 15) {
            total = 200 + ((hours - 5) * 50) + (supercharge * 50);
        } else {
            total = 550 + ((hours - 15) * 30) + (supercharge * 50);
        }
    }

    public Cl602b(int id, double sales, int code) {
        this.account = id;
        this.supercharge = code;
        this.hours = sales;
        this.total = 0;
        calc();
    }

    public String toString() {
        return String.format("%d\t\t%.2f\t%d\t$%.2f", account, hours, supercharge, total);
    }

    public int compareTo(Cl602b o) {
        return account - o.account;
    }
}

package q1;

public class bankAccount {
    public bankAccount(String nm, double amt) {
        name = nm;
       balance = amt;
    }

    public void deposit(double dp) {
        balance += dp;
    }

    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String name;
    public double balance;
}

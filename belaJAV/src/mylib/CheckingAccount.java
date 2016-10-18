package mylib;

import java.util.Date;

/**
 * Created by bnamora on 10/18/16.
 */
public class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount() {
        overdraftLimit = 10000;
    }

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount > 0) {
            this.setBalance(this.getBalance() - amount);
        }
        else if (Math.abs(this.getBalance() - amount) < overdraftLimit) {
            this.setBalance(this.getBalance() - amount);
        }
        else {
            System.out.println("Sorry, you don't have any sufficient fund");
        }
    }

}

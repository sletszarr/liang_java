package mylib;

/**
 * Created by bnamora on 10/18/16.
 */
public class SavingsAccount extends Account{

    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount > 0) {
            this.setBalance(this.getBalance() - amount);
        }
        else {
            System.out.println("Sorry, You don't have any sufficient cash ):");
        }
    }
}

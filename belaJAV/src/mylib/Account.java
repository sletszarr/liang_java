package mylib;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bnamora on 7/22/16.
 */

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this(id, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public Account(String name, int id, double balance, double annualInterestRate) {
        this(id, balance, annualInterestRate);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return new Date(dateCreated.getTime());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;

        // create transaction object
        String transactionDesc = this.name + " withdraws $ " + amount + " from the account";
        Transaction withdrawal = new Transaction('W', amount, balance, transactionDesc);

        // add withdrawal to transactions list
        this.transactions.add(withdrawal);

    }

    public void deposit(double amount) {
        balance += amount;

        // create transaction object
        String transactionDesc = this.name + " deposit $ " + amount + " to the account";
        Transaction deposits = new Transaction('D', amount, balance, transactionDesc);

        // add deposits to transaction list
        this.transactions.add(deposits);

    }

}

package chapter9.Ex9_7_AccountClass;

import java.util.Date;

/**
 * Created by bnamora on 7/22/16.
 */

public class TestAccount {

    public static void main(String[] args) {

        // create account
        Account acc = new Account(1122, 20000);

        // set annual interest to 4.5%
        acc.setAnnualInterestRate(0.045);

        // withdraw $2,500
        acc.withdraw(2500);

        // deposit $3,000
        acc.deposit(3000);

        // display balance
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
        System.out.println("Date created: " +
                acc.getDateCreated().toString());

    }
}

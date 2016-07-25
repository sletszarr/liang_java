package chapter10;

import mylib.Account;

import java.util.Scanner;

/**
 * Created by bnamora on 7/24/16.
 */

public class Ex10_7_ATMMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // initialize account
        Account[] accounts = getAccount(10);

        // run atm
        runATM(accounts);

    }

    public static Account[] getAccount(int n) {

        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++)
            accounts[i] = new Account(i, 100);

        return accounts;
    }

    public static void runATM(Account[] accounts) {

        Scanner input = new Scanner(System.in);

        while (true) {
            int id = -1;
            while (id < 0 || id >= accounts.length) {
                System.out.print("Enter an id: ");
                id = input.nextInt();
            }
            runMenu(accounts[id]);
        }
    }

    public static void runMenu(Account acc) {

        int choice = 0;
        while (choice != 4) {
            choice = getChoice();
            switch (choice) {
                case 1:
                    showBalance(acc);
                    break;
                case 2:
                    withdraw(acc);
                    break;
                case 3:
                    deposit(acc);
                    break;
            }
        }

    }

    public static int getChoice() {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        while (choice < 1 || choice > 4) {
            System.out.println("\nMain Menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            choice = input.nextInt();
        }

        return choice;
    }

    public static void showBalance(Account acc) {
        System.out.println("The balance is " + acc.getBalance());
    }

    public static void withdraw(Account acc) {
        Scanner input = new Scanner(System.in);

        // get withdraw amount
        System.out.print("Enter an amount to withdraw: ");
        double amount = input.nextDouble();

        // check balance and withdraw
        if (amount > acc.getBalance()) {
            System.out.println("You don't have that much money");
        } else {
            acc.withdraw(amount);
        }

        // show current balance
        System.out.printf("Your balance is %.2f now\n", acc.getBalance());

    }

    public static void deposit(Account acc) {
        Scanner input = new Scanner(System.in);

        // get deposit amount
        System.out.print("Enter an amount to deposit: ");
        double amount = input.nextDouble();

        // deposit amount to the account
        acc.deposit(amount);

        // show current balance
        System.out.printf("Your balance is %.2f now\n", acc.getBalance());

    }

}

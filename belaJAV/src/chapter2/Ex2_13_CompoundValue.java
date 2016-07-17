package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Financial application: compound value)
 * Suppose you save $100 each month into a savings account with the annual interest rate 5%.
 * Thus, the monthly inter- est rate is 0.05/12 = 0.00417.
 * After the first month, the value in the account becomes
 *      100 * (1 + 0.00417) = 100.417
 *
 * After the second month, the value in the account becomes
 *      (100 + 100.417) * (1 + 0.00417) = 201.252
 *
 * After the third month, the value in the account becomes
 *      (100 + 201.252) * (1 + 0.00417) = 302.507
 *
 * and so on.
 *
 * Write a program that prompts the user to enter a monthly saving amount
 * and displays the account value after the sixth month.
 * (In Exercise 5.30, you will use a loop to simplify the code
 * and display the account value for any month.)
 *
 */

public class Ex2_13_CompoundValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving & interest rate: ");
        double savingAmount = input.nextDouble();
        double interestRate = input.nextDouble() / 100;

        double monthlyInterestRate = interestRate / 12;
        double compoundInterest = 1 + monthlyInterestRate;
        double compoundValue = 0.0;


        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;

        System.out.println("After the sixth month, the account value is $" + (int) (compoundValue * 100) / 100.0);

    }
}

package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Financial application: calculate future investment value)
 * Write a program that reads in investment amount, annual interest rate,
 * and number of years, and dis- plays the future investment value using the following formula:
 *
 *      futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 *
 * For example, if you enter amount 1000,
 * annual interest rate 3.25%,
 * and number of years 1,
 * the future investment value is 1032.98.
 *
 */

public class Ex2_21_CalculateFutureInvestVal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble() / 100;
        double monthlyInterestRate = annualInterestRate / 12;

        System.out.print("Enter number of years: ");
        double totalYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, totalYears * 12);

        System.out.println("Accumulated value is " + futureInvestmentValue);

    }
}

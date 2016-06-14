package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
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

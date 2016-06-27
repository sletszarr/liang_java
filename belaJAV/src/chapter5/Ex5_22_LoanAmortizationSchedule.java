package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_22_LoanAmortizationSchedule {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get loan amount
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        // get number of years
        System.out.print("Number of Years: ");
        int numOfYears = input.nextInt();

        // get annual interest rate and compute monthly rate
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        // compute and display monthly payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12)));
        System.out.println();
        System.out.printf("Monthly Payment: %.2f", monthlyPayment);

        // compute and display total payment
        double totalPayment = monthlyPayment * numOfYears * 12;
        System.out.println();
        System.out.printf("Total Payment: %.2f\n", totalPayment);

        // initializing interest amount, principal and balance
        double interestAmount = 0;
        double principal = monthlyPayment;
        double balance = loanAmount;

        // display amortization schedule
        System.out.println();
        System.out.println("Payment#\t\t Interest\t\t Principal\t\t Balance\t\t ");

        for (int payCount = 1; payCount <= numOfYears * 12; payCount++) {
            // calculate interest amount
            interestAmount = balance * monthlyInterestRate;

            // calculate principal amount
            principal = monthlyPayment - interestAmount;

            // calculate remaining balance
            balance = balance - principal;

            // display the row
            System.out.printf("%2d\t\t\t\t %5.2f\t\t\t %.2f\t\t\t %.2f\n",
                    payCount, interestAmount, principal, balance);
        }
    }
}

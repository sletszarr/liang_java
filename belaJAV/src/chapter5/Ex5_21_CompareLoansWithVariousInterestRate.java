package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_21_CompareLoansWithVariousInterestRate {

    public static void main(String[] args) {

        double interestRate = 5.0;
        double interestInc = 1.0 / 8;

        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate\t\t MonthlyPayment\t\t Total Payment");
        while (interestRate <= 8.00) {

            double monthlyInterestRate = interestRate / 1200;

            double monthlyPayment = (loanAmount * monthlyInterestRate) /
                    (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%5.3f%%\t\t\t\t %6.2f\t\t\t\t %.2f\n", interestRate, monthlyPayment, totalPayment);

            interestRate += interestInc;
        }
    }
}

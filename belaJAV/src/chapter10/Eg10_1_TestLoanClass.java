package chapter10;

import java.util.Scanner;

/**
 * Created by bnamora on 7/22/16.
 */

public class Eg10_1_TestLoanClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get annual interest rate
        System.out.print("Enter annual interest rate," +
                " for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        // get number of years
        System.out.print("Enter number of years " +
                "as an integer: ");
        int numberOfYears = input.nextInt();

        // get loan amount
        System.out.print("Enter loan amount, " +
                "for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        // create loan object
        Eg10_2_Loan loan =
                new Eg10_2_Loan(annualInterestRate, numberOfYears, loanAmount);

        // display loan date,
        // monthly payment & total payment
        System.out.printf("The loan was created on %s\n" +
                        "The monthly payment is %.2f\n" +
                        "The total payment is %.2f",
                loan.getLoanDate().toString(),
                loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }

}

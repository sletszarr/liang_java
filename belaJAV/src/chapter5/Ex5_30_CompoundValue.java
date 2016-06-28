package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_30_CompoundValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter the number of months: ");
        int numberOfMonths = input.nextInt();

        double compoundAmound = 0;

        for (int i = 1; i <= numberOfMonths; i++) {
            compoundAmound = (amount + compoundAmound) * (1 + monthlyInterestRate);
        }

        System.out.printf("After %d months, the value in the accounts will be %.3f",
                numberOfMonths, compoundAmound);

    }

}

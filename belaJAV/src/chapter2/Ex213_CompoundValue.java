package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 */

public class Ex213_CompoundValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double interestRate = 5.0 / 100;
        double monthlyInterestRate = interestRate / 12;
        double compoundInterest = 1 + monthlyInterestRate;
        double compoundValue = 0.0;

        System.out.print("Enter the monthly saving: ");
        double savingAmount = input.nextDouble();

        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;
        compoundValue = (savingAmount + compoundValue) * compoundInterest;

        System.out.println("After the sixth month, the account value is $" + (int) (compoundValue * 100) / 100.0);

    }
}

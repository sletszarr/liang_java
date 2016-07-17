package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_31_ComputeCDValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();

        System.out.println("Month\tCD Value");
        for (int i = 1; i <= numberOfMonths; i++) {
            amount += amount * monthlyInterestRate;
            System.out.printf("%d\t\t%.2f\n", i, amount);
        }

    }

}

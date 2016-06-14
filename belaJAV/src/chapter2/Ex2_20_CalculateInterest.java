package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Financial application: calculate interest)
 * If you know the balance and the annual percentage interest rate,
 * you can compute the interest on the next monthly pay- ment using the following formula:
 *
 *      interest = balance * (annualInterestRate/1200)
 *
 * Write a program that reads the balance and the annual percentage interest rate
 * and displays the interest for the next month.
 *
 */

public class Ex2_20_CalculateInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterest = input.nextDouble();

        double interestAmount = balance * (annualInterest / 1200);

        System.out.println("The interest is " + interestAmount);

    }

}

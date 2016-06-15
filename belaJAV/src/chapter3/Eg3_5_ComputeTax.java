package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Eg3_5_ComputeTax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("0: Single filer");
        System.out.println("1: Married jointly or qualifying widow(er)");
        System.out.println("2: Married separately");
        System.out.println("3: Head of Household");
        System.out.printf("Enter your filing status: ");
        int status = input.nextInt();

        System.out.printf("Enter the taxable income: ");
        double income = input.nextInt();

        double tax = 0;
        double upperLimit10 = 0;
        double upperLimit15 = 0;
        double upperLimit25 = 0;
        double upperLimit28 = 0;
        double upperLimit33 = 0;

        if (status == 0) {
            upperLimit10 = 8350;
            upperLimit15 = 33950;
            upperLimit25 = 82250;
            upperLimit28 = 171550;
            upperLimit33 = 372950;
        }
        else if (status == 1) {
            upperLimit10 = 16700;
            upperLimit15 = 67900;
            upperLimit25 = 137050;
            upperLimit28 = 208850;
            upperLimit33 = 372950;
        }

        else if (status == 2) {
            upperLimit10 = 8350;
            upperLimit15 = 33950;
            upperLimit25 = 68525;
            upperLimit28 = 104425;
            upperLimit33 = 186475;
        }

        else if (status == 3) {
            upperLimit10 = 11950;
            upperLimit15 = 45500;
            upperLimit25 = 117450;
            upperLimit28 = 190200;
            upperLimit33 = 372950;
        }

        if (income <= upperLimit10) {
            tax = income * 0.10;
        }
        else if (income <= upperLimit15) {
            tax = upperLimit10 * 0.10
                    + (income - upperLimit10 * 0.15);
        }
        else if (income <= upperLimit25) {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (income - upperLimit15) * 0.25;
        }
        else if (income <= upperLimit28) {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (upperLimit25 - upperLimit15) * 0.25
                    + (income - upperLimit25) * 0.28;
        }
        else if (income <= upperLimit33) {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (upperLimit25 - upperLimit15) * 0.25
                    + (upperLimit28 - upperLimit25) * 0.28
                    + (income - upperLimit28) * 0.33;
        }
        else {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (upperLimit25 - upperLimit15) * 0.25
                    + (upperLimit28 - upperLimit25) * 0.28
                    + (upperLimit33 - upperLimit28) * 0.33
                    + (income - upperLimit33) * 0.35;
        }

        System.out.println("Your tax is " + (int) (tax * 100) / 100.0);

    }
}

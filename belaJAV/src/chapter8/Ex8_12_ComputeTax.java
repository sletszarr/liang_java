package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/14/2016.
 */

public class Ex8_12_ComputeTax {

    public static void main(String[] args) {

        int status = getStatus();
        double taxableIncome = getTaxableIncome();
        double tax = computeTax(status, taxableIncome);

        System.out.printf("Your tax is $%.2f", tax);

    }

    public static int getStatus() {

        Scanner input = new Scanner(System.in);

        int filingStatus;
        boolean outOfRange;

        do {

            System.out.println("0: Single filer");
            System.out.println("1: Married jointly or qualifying widow(er)");
            System.out.println("2: Married separately");
            System.out.println("3: Head of household");
            System.out.print("Enter your filing status: ");

            filingStatus = input.nextInt();
            outOfRange = filingStatus < 0 || filingStatus > 3;

            if (outOfRange) {
                System.out.println("Enter 0-3 to represent your filing status");
            }
        } while (outOfRange);

        return filingStatus;

    }

    public static double getTaxableIncome() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your taxable income: ");
        return input.nextDouble();

    }

    public static double computeTax(int status, double taxableIncome) {

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},   // Single filer
                {16700, 67900, 137050, 208850, 372950}, // Married, filed  jointly
                                                        // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},   // Married, filed separately
                {11950, 45500, 117450, 190200, 372950}  // Head of household
        };

        double tax;

        if (taxableIncome <= brackets[status][0]) {
            tax = taxableIncome * rates[0];
        }
        else if (taxableIncome <= brackets[status][1]) {
            tax = brackets[status][0] * rates[0] +
                    (taxableIncome - brackets[status][0]) * rates[1];
        }
        else if (taxableIncome <= brackets[status][2]) {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (taxableIncome - brackets[status][1]) * rates[2];
        }
        else if (taxableIncome <= brackets[status][3]) {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (taxableIncome - brackets[status][2]) * rates[3];

        }
        else if (taxableIncome <= brackets[status][4]) {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (taxableIncome - brackets[status][3]) * rates[4];

        }
        else {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][4] - brackets[status][3]) * rates[4] +
                    (taxableIncome - brackets[status][4]) * rates[5];
        }

        return tax;

    }


}

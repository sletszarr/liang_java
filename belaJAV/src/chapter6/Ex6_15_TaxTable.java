package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_15_TaxTable {

    public static void main(String[] args) {

        System.out.println("Taxable\t\tSingle\t\tMarried Joint\t\tMarried \t\tHead of\n" +
                           "Income \t\t      \t\tor Qualifying\t\tSeparate\t\ta House\n" +
                           "       \t\t      \t\tWidow(er)" );
        System.out.println("=========================================================" +
                "==================");

        for (int i = 50000; i <= 60000; i += 50) {
            System.out.printf("%5d\t\t%5d\t\t%5d\t\t\t\t%5d\t\t\t%5d\n", i,
                    Math.round(computeTax(0, i)),
                    Math.round(computeTax(1, i)),
                    Math.round(computeTax(2, i)),
                    Math.round(computeTax(3, i)));
        }

    }

    public static double computeTax(int status, double taxableIncome) {

        boolean single = (status == 0);
        boolean marriedOrWidow = (status == 1);
        boolean marriedSeparateFiling = (status == 2);
        boolean headOfHouseHold = (status == 3);

        int upperLimit10 = 0,
                upperLimit15 = 0,
                upperLimit25 = 0,
                upperLimit28 = 0,
                upperLimit33 = 0;
        double tax = 0.0;

        if (single) {
            upperLimit10 = 8350;
            upperLimit15 = 33950;
            upperLimit25 = 82250;
            upperLimit28 = 171550;
            upperLimit33 = 372950;
        }
        else if (marriedOrWidow) {
            upperLimit10 = 16700;
            upperLimit15 = 67900;
            upperLimit25 = 137050;
            upperLimit28 = 208850;
            upperLimit33 = 372950;
        }
        else if (marriedSeparateFiling) {
            upperLimit10 = 8350;
            upperLimit15 = 33950;
            upperLimit25 = 68525;
            upperLimit28 = 104425;
            upperLimit33 = 186475;
        }
        else if (headOfHouseHold) {
            upperLimit10 = 11950;
            upperLimit15 = 45500;
            upperLimit25 = 117450;
            upperLimit28 = 190200;
            upperLimit33 = 372950;
        }

        if (taxableIncome <= upperLimit10) {
            tax = taxableIncome * 0.10;
        }
        else if (taxableIncome <= upperLimit15) {
            tax = upperLimit10 * 0.10
                    + (taxableIncome - upperLimit10) * 0.15;

        }
        else if (taxableIncome <= upperLimit25) {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (taxableIncome - upperLimit15) * 0.25;
        }
        else if (taxableIncome <= upperLimit28) {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (upperLimit25 - upperLimit15) * 0.25
                    + (taxableIncome - upperLimit25) * 0.28;
        }
        else if (taxableIncome <= upperLimit33) {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (upperLimit25 - upperLimit15) * 0.25
                    + (upperLimit28 - upperLimit25) * 0.28
                    + (taxableIncome - upperLimit28) * 0.33;
        }
        else {
            tax = upperLimit10 * 0.10
                    + (upperLimit15 - upperLimit10) * 0.15
                    + (upperLimit25 - upperLimit15) * 0.25
                    + (upperLimit28 - upperLimit25) * 0.28
                    + (upperLimit33 - upperLimit28) * 0.33
                    + (taxableIncome - upperLimit33) * 0.35;
        }

        return tax;
    }

}

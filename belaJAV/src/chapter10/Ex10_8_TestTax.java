package chapter10;

import mylib.Tax;

/**
 * Created by bnamora on 7/24/16.
 */

public class Ex10_8_TestTax {

    public static void main(String[] args) {

        // define rates and brackets
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},   // Single filer
                {16700, 67900, 137050, 208850, 372950}, // Married, filed  jointly
                                                        // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},   // Married, filed separately
                {11950, 45500, 117450, 190200, 372950}  // Head of household
        };

        // create tax object
        Tax tax = new Tax(Tax.SINGLE_FILER, brackets, rates, 50000);

        // display tax list
        System.out.println("Taxable\t\tSingle\t\t\tMarried   \t\tMarried   \t\tHead of");
        System.out.println("Income \t\tFiler \t\t\tjointly or\t\tfiled     \t\tHousehold");
        System.out.println("       \t\t      \t\t\twidow(er) \t\tseparately");
        System.out.println("-----------------------------" +
                "----------------------------------------");
        for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
            System.out.printf("$%d\t\t", taxableIncome);
            tax.setTaxableIncome(taxableIncome);

            for (int status = 0; status < 4; status++) {
                tax.setFilingStatus(status);
                System.out.printf("$%-8.2f\t\t", tax.getTax());
            }

            System.out.println();
        }
    }
}

package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Ex4_23_PayrollApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();

        System.out.print("Number of hours worked in a week: ");
        int totalHourInAWeek = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        // calculating net pay
        double grossPay = totalHourInAWeek * hourlyRate;
        double totalFederalTax = grossPay * federalTaxRate;
        double totalStateTax = grossPay * stateTaxRate;
        double totalDeduction = totalFederalTax + totalStateTax;
        double netPay = grossPay - totalDeduction;

        // display result
        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Hours Worked: " + totalHourInAWeek);
        System.out.println("Pay Rate: " + hourlyRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions: ");
        System.out.printf("\tFederal Withholding (%3.1f%%): $%5.2f\n", federalTaxRate * 100,
                totalFederalTax);
        System.out.printf("\tState Withholding (%3.1f%%): $%5.2f\n", stateTaxRate * 100,
                totalStateTax);
        System.out.printf("Total Deduction: $%5.2f\n", totalDeduction);
        System.out.printf("Net pay: $%5.2f", netPay);

    }

}

package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_31_CurrencyExchange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars do RMB: ");
        double dollarToRMB_Rate = input.nextDouble();

        System.out.println("0 - Convert dollars to RMB");
        System.out.println("1 - Convert RMB to dollars");
        System.out.print("Choose your option: ");
        int choice = input.nextInt();

        if (choice == 0 ^ choice == 1) {

            if (choice == 0) {
                System.out.print("Enter the dollar amount: ");
                double dollarAmount = input.nextDouble();
                double rmbAmount = dollarAmount * dollarToRMB_Rate;
                System.out.println("$" + (int) (dollarAmount * 100) / 100.0 + " is " + (int) (rmbAmount * 100) / 100.0 + " yuan");
            }
            else {
                System.out.print("Enter the RMB amount: ");
                double rmbAmount = input.nextDouble();
                double dollarAmount = (1 / dollarToRMB_Rate) * rmbAmount;
                System.out.println((int) (rmbAmount * 100) / 100.0 + " yuan is $" + (int) (dollarAmount * 100) / 100.0);
            }

        }
        else {
            System.out.println("Your input is invalid");
            System.exit(1);
        }

    }

}

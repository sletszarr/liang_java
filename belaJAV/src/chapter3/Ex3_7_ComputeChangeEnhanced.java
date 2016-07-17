package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_7_ComputeChangeEnhanced {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.57: ");
        double amount = input.nextDouble();

        if (amount > 0) {
            int totalCents = (int) (amount * 100);

            int dollarAmount = totalCents / 100;
            int remainingCents = totalCents % 100;

            int quarterAmount = remainingCents / 25;
            remainingCents %= 25;

            int dimeAmount = remainingCents / 10;
            remainingCents %= 10;

            int nickleAmount = remainingCents / 5;
            remainingCents %= 5;

            System.out.println("Your amount "+amount+" consists of: ");

            System.out.println((dollarAmount == 1) ? dollarAmount + " dollar" : dollarAmount + " dollars");
            System.out.println((quarterAmount == 1) ? quarterAmount + " quarter" : quarterAmount + " quarters");
            System.out.println((dimeAmount == 1) ? dimeAmount + " dime" : dimeAmount + " dimes");
            System.out.println((nickleAmount == 1) ? nickleAmount + " nickle" : nickleAmount + " nickles");
            System.out.println((remainingCents == 1) ? remainingCents + " pennie" : remainingCents + " pennies");
        }
        else {
            System.out.println("You must enter a non-zero denomination");
            System.exit(1);
        }

    }

}

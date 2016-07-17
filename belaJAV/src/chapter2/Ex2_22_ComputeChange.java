package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Financial application: monetary units)
 * Rewrite Listing 2.10, ComputeChange .java,
 * to fix the possible loss of accuracy when converting a double value to an int value.
 *
 * Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents
 *
 */

public class Ex2_22_ComputeChange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.57: ");
        int amount = input.nextInt();

        int dollarAmount = amount / 100;
        int remainingCents = amount % 100;

        System.out.println("Your amount $"+dollarAmount+"."+remainingCents+" consists of: ");

        int quarterAmount = remainingCents / 25;
        remainingCents %= 25;

        int dimeAmount = remainingCents / 10;
        remainingCents %= 10;

        int nickleAmount = remainingCents / 5;
        remainingCents %= 5;

        System.out.println(dollarAmount + " dollars");
        System.out.println(quarterAmount + " quarters");
        System.out.println(dimeAmount + " dimes");
        System.out.println(nickleAmount + " nickles");
        System.out.println(remainingCents + " pennies");

    }
}

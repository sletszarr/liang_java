package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class Eg210_ComputeChange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.57: ");
        double amount = input.nextDouble();

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
        System.out.println(dollarAmount + " dollars");
        System.out.println(quarterAmount + " quarters");
        System.out.println(dimeAmount + " dimes");
        System.out.println(nickleAmount + " nickles");
        System.out.println(remainingCents + " pennies");

    }

}

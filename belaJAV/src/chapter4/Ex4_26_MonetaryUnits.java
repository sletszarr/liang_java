package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Ex4_26_MonetaryUnits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        String amount = input.nextLine();

        int delimiterIndex = amount.indexOf('.');

        int dollarAmount = Integer.parseInt(amount.substring(0, delimiterIndex));
        int remainingCents = Integer.parseInt(amount.substring(delimiterIndex + 1));

        int quarterAmount = remainingCents / 25;
        remainingCents %= 25;

        int dimeAmount = remainingCents / 10;
        remainingCents %= 10;

        int nickleAmount = remainingCents / 5;
        remainingCents %= 5;

        System.out.printf("Your amount %s consists of:\n", amount);
        System.out.println(dollarAmount+" dollars");
        System.out.println(quarterAmount + " quarters");
        System.out.println(dimeAmount + " dimes");
        System.out.println(nickleAmount + " nickles");
        System.out.println(remainingCents + " pennies");

    }
}

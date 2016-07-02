package chapter6;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_31_CreditCardNumberValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        long ccNum = input.nextLong();

        System.out.println("That is " +
                (isValidCreditCard(ccNum) ? "a valid" : "an invalid") +
                " credit card number"
        );

    }

    public static boolean isValidCreditCard(long number) {

        if (isValidPrefix(number) &&
                (getSize(number) > 12 && getSize(number) < 17)) {

            int totalSum = getSumOfDoubledEvenPlace(number) +
                    getSumOfOddPlace(number);

            return (totalSum % 10 == 0);

        }
        else{
            return false;
        }
    }

    public static long getPrefix(long number, int k) {

        String prefix = "";
        String numString = number + "";

        for (int i = 0; i < k; i++) {
            prefix += numString.charAt(i);
        }

        return Long.parseLong(prefix);

    }

    public static boolean isValidPrefix(long number) {

        // valid visa
        if (getPrefix(number, 1) == 4) {
            return true;
        }

        // valid mastercard
        if (getPrefix(number, 1) == 5) {
            return true;
        }

        // valid discovery
        if (getPrefix(number, 1) == 6) {
            return true;
        }

        // valid amex
        if (getPrefix(number, 2) == 37) {
            return true;
        }

        return false;
    }

    public static int getSize(long number) {
        String numString = number + "";
        return numString.length();
    }

    public static int getSingleDigit(int num) {
        return num % 10 + num / 10;
    }

    public static int getSumOfDoubledEvenPlace(long number) {

        String numString = number + "";
        int sum = 0;
        int doubledVal;

        for (int i = numString.length() - 2; i >= 0; i -= 2) {
            doubledVal = Character.getNumericValue(numString.charAt(i)) * 2;
            doubledVal = (doubledVal > 9) ? getSingleDigit(doubledVal) : doubledVal;
            sum += doubledVal;
        }

        return sum;

    }

    public static int getSumOfOddPlace(long number) {

        String numString = number + "";
        int sum = 0;

        for (int i = numString.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numString.charAt(i));
        }

        return sum;

    }

}

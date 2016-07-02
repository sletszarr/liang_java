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
        return number / (long) Math.pow(10, getSize(number) - k);
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
        int size = 0;

        while (number > 0) {
            number /= 10;
            size++;
        }

        return size;

    }

    public static int getSingleDigit(int num) {
        return num % 10 + num / 10;
    }

    public static int getSumOfDoubledEvenPlace(long number) {

        int sum = 0;
        int doubledVal;
        number /= 10;

        while (number > 0) {
            doubledVal = (int) (number % 10) * 2;
            doubledVal = (doubledVal > 9) ? getSingleDigit(doubledVal) : doubledVal;
            sum += doubledVal;
            number /= 100;
        }

        return sum;

    }

    public static int getSumOfOddPlace(long number) {

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 100;
        }

        return sum;

    }

}

package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_2_SumDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int num = input.nextInt();

        System.out.println("The sum of digit in " +
                num + " is " + sumDigit(num));

    }

    public static int sumDigit(long n) {

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;

    }

}

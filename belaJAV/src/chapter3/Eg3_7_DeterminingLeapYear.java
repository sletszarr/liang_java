package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Eg3_7_DeterminingLeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // A leap year is divisible by 4
        boolean isLeapYear = (year % 4 == 0);

        // A leap year is divisible by 400y
        isLeapYear = isLeapYear || (year % 400 == 0);

        // A leap year is not divisible by 100
        isLeapYear = isLeapYear && (year % 100 != 0);


        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

    }

}

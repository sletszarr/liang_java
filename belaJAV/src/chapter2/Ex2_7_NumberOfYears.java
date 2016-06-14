package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Find the number of years)
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion),
 * and displays the number of years and days for the min- utes.
 * For simplicity, assume a year has 365 days.
 *
 */

public class Ex2_7_NumberOfYears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long numOfMinutes = input.nextLong();

        int totalMinutesInAYear = 60 * 24 * 365;
        int totalMinutesInADay = 60 * 24;

        long numOfYears = numOfMinutes / totalMinutesInAYear;
        long numOfDays = (numOfMinutes / totalMinutesInADay);
        long numOfRemainingDays = numOfDays % 365;

        System.out.println(numOfMinutes + " minutes is approximately " + numOfYears + " years and " + numOfRemainingDays + " days");

    }
}

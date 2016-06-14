package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
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

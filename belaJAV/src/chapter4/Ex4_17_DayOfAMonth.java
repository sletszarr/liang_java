package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_17_DayOfAMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        System.out.print("Enter a month: ");
        String month = input.next();

        int days = 0;

        if (month.equals("Jan")
                || month.equals("Mar")
                || month.equals("Mei")
                || month.equals("Jul")
                || month.equals("Aug")
                || month.equals("Oct")
                || month.equals("Dec")) {
            days = 31;
        }
        else if (month.equals("Apr")
                || month.equals("Jun")
                || month.equals("Sep")
                || month.equals("Nov")) {
            days = 30;
        }
        else if (month.equals("Feb")) {
            if (isLeapYear) {
                days = 29;
            }
            else {
                days = 28;
            }
        }
        else {
            System.out.println("You've entered an invalid month abbreviation");
            System.exit(1);
        }

        System.out.printf("%s %d has %d days", month, year, days);

    }

}

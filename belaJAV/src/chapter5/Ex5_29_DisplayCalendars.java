package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_29_DisplayCalendars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        System.out.print("Enter the day: ");
        int firstDay = input.nextInt();

        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"
        };

        String day31 = "JanuaryMarchMayJulyAugustOctoberDecember";
        String day30 = "AprilJuneSeptemberNovember";

        String[] days = {"Sun", "Mon", "Tue",
                "Wed", "Thu", "Fri", "Sat"
        };


        for (int k = 0; k < 12; k++) {

            // display spaces between months
            System.out.println("\n");

            // display month's header
            System.out.printf("\t\t\t\t  %-9s %d\n", months[k], year);
            System.out.println("===================================================");
            System.out.printf("%3s\t\t%3s\t\t%3s\t\t%3s\t\t%3s\t\t%3s\t\t%3s\n",
                    "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            // display empty space before the first day
            for (int l = 0; l < firstDay; l++) {
                System.out.print("   \t\t");
            }

            // count the number of days in this month
            int numOfDays = 0;
            if (day31.contains(months[k])) {
                numOfDays = 31;
            } else if (day30.contains(months[k])) {
                numOfDays = 30;
            } else if (isLeapYear) {
                numOfDays = 29;
            } else {
                numOfDays = 28;
            }

            // display the dates
            for (int i = 1; i <= numOfDays; i++) {
                System.out.printf("%-3s\t\t", i);
                firstDay++;
                if (firstDay % 7 == 0) {
                    System.out.println();
                    firstDay = 0;
                }
            }

        }

    }
}

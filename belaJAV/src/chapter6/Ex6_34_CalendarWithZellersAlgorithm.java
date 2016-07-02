package chapter6;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/2/2016.
 */
public class Ex6_34_CalendarWithZellersAlgorithm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);

    }

    public static void printMonth(int year, int month) {

        printMonthTitle(year, month);

        printMonthBody(year, month);

    }

    public static void printMonthTitle(int year, int month) {

        System.out.println("\t\t"
                + getMonthName(month) + " " + year);
        System.out.println("============================");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {

        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay ; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if (++startDay % 7 == 0) {
                System.out.println();
            }
        }

    }

    public static String getMonthName(int month) {

        String[] monthNames = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};

        return monthNames[month - 1];

    }

    public static int getStartDay(int year, int month) {

        // jan and feb
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        // get century & year
        int century = year / 100;
        int yearOfCentury = year % 100;

        // zeller's algorithm
        // get day: 0.saturday - 6.friday
        int day = (1 + 26 * (month + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;

        // convert to: 0.sunday - 6.saturday
        return (day == 0) ? 6 : day - 1;
    }


    public static int getNumberOfDaysInMonth(int year, int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            return (isLeapYear(year) ? 29 : 28);
        }

        return 0;

    }

    public static boolean isLeapYear(int year) {

        return year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0);

    }
}

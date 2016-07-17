package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_16_TotalDaysInAYear {

    public static void main(String[] args) {

        System.out.println("Year\t\tTotal Days");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%4d\t\t%3d\n", i, numberOfDaysInAYear(i));
        }

    }

    public static int numberOfDaysInAYear(int year) {

        return (isLeapYear(year) ? 366 : 365);

    }

    public static boolean isLeapYear(int year) {

        return (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0));

    }

}

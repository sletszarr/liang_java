package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_21_DayOfTheWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.printf("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.printf("Enter day of the month (1-31): ");
        int date = input.nextInt();

        boolean janFeb = (month == 1 || month == 2);

        if (janFeb) {
            month += 12;
            year--;
        }

        int century = year / 100;
        int yearOfCentury = year % 100;

        int day = (date + 26 * (month + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;

        String dayName = "";
        switch (day) {
            case 0:
                dayName = "Saturday";
                break;
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
        }

        System.out.println("Day of the week is " + dayName);

    }
}


package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_11_DaysInMonths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = input.nextInt() - 1;

        System.out.print("Enter year: ");
        int year = input.nextInt();

        boolean isLeapYear = ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0);

        int days = 0;
        String[] monthName = {"January", "February", "March", "April", "Mei", "June", "July", "August", "September", "October", "November", "December"};

        switch (month) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                days = 31;
                break;
            case 3:
            case 5:
            case 8:
            case 10:
                days = 30;
                break;
            case 1:
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("You've entered invalid month");
                System.exit(1);
        }

        System.out.println(monthName[month]+ " " + year + " had " + days + " days");

    }
}

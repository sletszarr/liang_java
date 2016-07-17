package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_28_DisplayTheFirstDayOfTheMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        boolean isLeapYear = ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0);

        System.out.printf("Enter the first day of %d: ", year);
        int day = input.nextInt();

        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"
        };

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"
        };

        String day31 = "JanuaryMarchMayJulyAugustOctoberDecember";
        String day30 = "AprilJuneSeptemberNovember";

        for (int i = 0; i < 12; i++) {
            System.out.printf("%s 1, %d is %s\n", months[i], year, days[day]);
            if (day31.contains(months[i])) {
                day = (day + 31) % 7;
            }
            else if (day30.contains(months[i])) {
                day = (day + 30) % 7;
            }
            else if (isLeapYear) {
                day = (day + 29) % 7;
            }
            else {
                day = (day + 28) % 7;
            }
        }




    }
}

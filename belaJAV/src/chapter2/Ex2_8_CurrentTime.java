package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Current time)
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
 * Revise the program so that it prompts the user to enter the time zone offset to GMT
 * and displays the time in the specified time zone.
 *
 */

public class Ex2_8_CurrentTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int gmtOffset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHoursGMT = totalHours % 24;
        long currentHours = currentHoursGMT + gmtOffset;

        System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}

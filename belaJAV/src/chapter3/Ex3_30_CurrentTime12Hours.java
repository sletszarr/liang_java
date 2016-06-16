package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_30_CurrentTime12Hours {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int gmtOffset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long secondNow = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long minuteNow = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long hourNow = totalHours % 24;
        long hourOffset = hourNow + gmtOffset;
        long hourHalfDay = hourOffset % 12;

        System.out.println("The current time is " + hourHalfDay + ":" + minuteNow + ":" + secondNow);

    }

}

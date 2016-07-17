package chapter6;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_25_MillisConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();

        System.out.println(convertMillis(millis));

    }

    public static String convertMillis(long millis) {

        long totalSeconds = millis / 1000;
        int seconds = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        int minutes = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        return (totalHours + ":" +
                minutes + ":" +
                seconds);
    }

}



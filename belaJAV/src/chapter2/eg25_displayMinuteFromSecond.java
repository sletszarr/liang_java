package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class Eg25_DisplayMinuteFromSecond {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("input a number of seconds: ");
        int totalSeconds = input.nextInt();

        int totalMinutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds is " + totalMinutes + " minutes and " + remainingSeconds + " seconds");

    }
}

package chapter1;

/**
 * Created by bnamora on 6/7/16.
 *
 * (Average speed in miles)
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 *
 */

public class Ex1_10_AvgSpeed {

    public static void main(String[] args) {

        double miles = 14 / 1.6;
        double hours = 45.0 / 60 + 30.0 / 3600;

        System.out.print("A runner run " + miles + " miles ");
        System.out.println("in " + hours + " hour");
        System.out.println("His average speed is " + miles / hours + " mph");

    }
}

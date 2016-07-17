package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Cost of driving)
 * Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip.
 *
 */

public class Ex2_23_DrivingCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();

        System.out.printf("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.printf("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double drivingCost = drivingDistance / milesPerGallon * pricePerGallon;

        System.out.println("The cost of driving is $" + drivingCost);

    }
}

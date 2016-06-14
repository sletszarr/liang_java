package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Health application: computing BMI)
 * Body Mass Index (BMI) is a measure of health on weight.
 * It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
 *
 * Write a program that prompts the user to enter a weight in pounds and height in inches
 * and displays the BMI.
 *
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 *
 */

public class Ex2_14_ComputingBMI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKgs = weightInPounds * 0.453592;

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();
        double heightInMeters = heightInInches * 0.0254;

        double bmiValue = weightInKgs / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + bmiValue);

    }
}

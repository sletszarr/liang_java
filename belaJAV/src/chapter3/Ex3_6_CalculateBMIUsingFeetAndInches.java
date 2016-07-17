package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_6_CalculateBMIUsingFeetAndInches {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter feet: ");
        double heightFeet = input.nextDouble();

        System.out.print("Enter inches: ");
        double heightInches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359273;
        final double METERS_PER_FEET = 0.3048;
        final double METERS_PER_INCHES = 0.0254;

        double weightInKgs = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = heightFeet * METERS_PER_FEET + heightInches * METERS_PER_INCHES;
        double bmiVal = weightInKgs / Math.pow(heightInMeters, 2);

        System.out.println("Your BMI index is " + bmiVal);
        if (bmiVal < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmiVal < 25.0) {
            System.out.println("Normal");
        }
        else if (bmiVal < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }

    }

}
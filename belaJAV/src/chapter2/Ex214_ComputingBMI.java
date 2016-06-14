package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 */

public class Ex214_ComputingBMI {

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

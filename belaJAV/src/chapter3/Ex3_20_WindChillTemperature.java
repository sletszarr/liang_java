package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_20_WindChillTemperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double tempInFahrenheit = input.nextDouble();

        // validating temperature
        boolean validTemp = (tempInFahrenheit >= -58 && tempInFahrenheit <= 41);
        if (!validTemp) {
            System.out.println("Please enter a valid temperature");
            System.exit(1);
        }

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeedMph = input.nextDouble();

        // validating wind speed
        boolean validWindSpeed = windSpeedMph >= 2;
        if (!validWindSpeed) {
            System.out.println("Please enter a valid wind speed");
            System.exit(1);
        }

        double windChillIndex = 35.74 + 0.6215 * tempInFahrenheit - 35.75 * Math.pow(windSpeedMph, 0.16) + 0.4275 * tempInFahrenheit * Math.pow(windSpeedMph, 0.16);

        System.out.println("The wind chill index is " + windChillIndex);

    }
}

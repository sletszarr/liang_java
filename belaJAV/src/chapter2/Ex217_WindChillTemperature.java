package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 */

public class Ex217_WindChillTemperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double tempInFahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeedMph = input.nextDouble();

        double windChillIndex = 35.74 + 0.6215 * tempInFahrenheit - 35.75 * Math.pow(windSpeedMph, 0.16) + 0.4275 * tempInFahrenheit * Math.pow(windSpeedMph, 0.16);

        System.out.println("The wind chill index is " + windChillIndex);

    }
}

package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_11_ComputeDeviation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.printf("The mean is %.2f\n", mean(numbers));
        System.out.printf("The standard deviation is %.5f", deviation(numbers));

    }

    public static double deviation(double[] numbers) {
        double mean = mean(numbers);
        double deviationSeries = 0;
        double deviation;

        // count deviation series
        for (double number : numbers) {
            deviationSeries += (number - mean) * (number - mean);
        }

        // count deviation
        deviation = Math.sqrt(deviationSeries / (numbers.length - 1));

        return deviation;
    }

    public static double mean(double[] numbers) {

        double sum = 0.0;
        double average;

        for (double number : numbers) {
            sum += number;
        }

        average = sum / numbers.length;

        return average;

    }
}

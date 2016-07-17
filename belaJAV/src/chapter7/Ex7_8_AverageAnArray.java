package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_8_AverageAnArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] integers = new int[10];
        double[] doubles = new double[10];

        // get 10 integers and count average
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();
        }
        System.out.println("The average is " +
                average(integers));

        // get 10 doubles and count average
        System.out.print("Enter 10 doubles: ");
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = input.nextDouble();
        }
        System.out.println("The average is " +
                average(doubles));

    }

    public static int average(int[] array) {
        int sum = 0;
        int average;

        for (int item: array)
            sum += item;

        average = sum / array.length;

        return average;
    }

    public static double average(double[] array) {
        double sum = 0;
        double average;

        for (double item: array)
            sum += item;

        average = sum / array.length;

        return average;
    }
}

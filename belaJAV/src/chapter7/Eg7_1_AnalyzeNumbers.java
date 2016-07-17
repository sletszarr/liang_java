package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/3/2016.
 */

public class Eg7_1_AnalyzeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for array size
        System.out.print("Enter number of items: ");
        int n = input.nextInt();

        // create array
        double[] numbers = new double[n];
        double sum = 0.0;

        // initialize array
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        // count average
        double average = sum / n;

        // count the sum of above average num
        int aboveAvgCount = 0;
        for (int i = 0; i < n; i++) {
            if(numbers[i]>average) aboveAvgCount++;
        }

        // display result
        System.out.println("Average is " + average);
        System.out.println("There are " +
                aboveAvgCount + " above average numbers");

    }
}

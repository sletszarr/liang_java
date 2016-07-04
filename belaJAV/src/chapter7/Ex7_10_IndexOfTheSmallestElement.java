package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_10_IndexOfTheSmallestElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter 10 doubles: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("Index of the smallest double is: " +
                indexOfTheSmallestElement(numbers));

    }

    public static int indexOfTheSmallestElement(double[] numbers) {

        double min = numbers[0];
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                minIndex = i;
            }
        }

        return minIndex;

    }

}

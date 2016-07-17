package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_9_FindTheSmallestElement {

    public static void main(String[] args) {

        double[] numbers = new double[10];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 doubles: ");
        for(int i =0;i<numbers.length;i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is " +
                min(numbers));

    }

    public static double min(double[] numbers) {

        double min = numbers[0];
        for (double number : numbers) {
            if (number < min)
                min = number;
        }

        return min;
    }
}

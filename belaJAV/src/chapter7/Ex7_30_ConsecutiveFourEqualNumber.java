package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_30_ConsecutiveFourEqualNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int length = input.nextInt();

        int[] numbers = new int[length];
        System.out.print("Enter the values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The list has" +
                ((isConsecutiveFour(numbers)) ? " " : " no ") +
                "consecutive fours"
        );
    }

    public static boolean isConsecutiveFour(int[] numbers) {
        int consecutiveCounter = 0;

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                consecutiveCounter++;
            } else {
                consecutiveCounter = 0;
            }

            if (consecutiveCounter == 3)
                return true;
        }

        return false;
    }

}

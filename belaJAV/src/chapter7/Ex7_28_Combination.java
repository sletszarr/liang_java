package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_28_Combination {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // sort numbers
        sort(numbers);

        // display combination
        displayCombination(numbers);
    }

    public static void sort(int[] numbers) {
        int minIndex;
        int temp;

        for (int i = 0; i < numbers.length; i++) {

            minIndex = i;

            for (int k = i+1; k < numbers.length; k++) {
                if (numbers[k] < numbers[minIndex])
                    minIndex = k;
            }

            if (minIndex != i) {
                temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }

    }

    // display combination of a sorted number
    public static void displayCombination(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1])
                continue;

            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[k] == numbers[k - 1])
                    continue;

                System.out.printf("%d, %d\n",
                        numbers[i], numbers[k]);
            }
        }
    }

}

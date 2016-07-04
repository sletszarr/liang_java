package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/5/2016.
 */

public class Ex7_19_IsSorted {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int totalNums = input.nextInt();

        int[] numbers = new int[totalNums];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The list is " +
                (isSorted(numbers) ? "already " : "not ") +
                "sorted"
        );
    }

    public static boolean isSorted(int[] numbers) {

        boolean sorted = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                sorted = false;
                break;
            }
        }

        return sorted;

    }

}

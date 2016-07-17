package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_15_EliminateDuplicate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get 10 integers
        int numbers[] = new int[10];
        System.out.print("Enter 10 integers: ");
        for(int i =0;i<numbers.length;i++) {
            numbers[i] = input.nextInt();
        }

        // remove duplicate
        int[] distinctNums = eliminateDuplicates(numbers);

        // display distinct nums
        printDistinctNum(distinctNums);

    }

    public static int[] eliminateDuplicates(int[] numbers) {
        int[] distinctNums = new int[numbers.length];
        int distinctCount = 0;

        for (int number : numbers) {
            if (isAlreadyIn(distinctNums, number))
                continue;
            distinctNums[distinctCount++] = number;
        }

        return distinctNums;

    }

    public static void printDistinctNum(int[] numbers) {
        for (int number : numbers) {
            if (number == 0) break;
            System.out.printf("%d ", number);
        }

        System.out.println();
    }

    public static boolean isAlreadyIn(int[] numbers, int key) {

        for (int number : numbers) {
            if (number == key)
                return true;
        }

        return false;
    }
}

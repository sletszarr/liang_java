package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_3_CountNumberOccurrences {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prepare number holder
        int[] numbers = new int[100];
        int num;

        // get number from user
        System.out.print("Enter any integer between 1 and 100: ");
        while (true) {
            num = input.nextInt();

            // only count 1 - 100
            if (num == 0) break;
            if (num < 0 || num > 100) continue;

            numbers[num - 1]++;
        }

        printNumberOccurrences(numbers);

    }

    public static void printNumberOccurrences(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.printf("%d occurs %d ", i + 1, numbers[i]);
                System.out.println((numbers[i] == 1) ? "time" : "times");
            }
        }

    }

}

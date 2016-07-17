package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_5_PrintDistinctNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int numCount = 0;
        int num;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            if (findNum(numbers, num) == num) {
                continue;
            }
            numbers[numCount++] = num;
        }

        printDistinctNum(numbers);
    }

    public static int findNum(int[] numbers, int num) {

        for (int number: numbers) {
            if (number == num)
                return num;
        }

        return -1;
    }

    public static void printDistinctNum(int[] numbers) {

        for (int number: numbers) {
            if (number != 0) {
                System.out.printf("%d ", number);
            }
        }
    }

}

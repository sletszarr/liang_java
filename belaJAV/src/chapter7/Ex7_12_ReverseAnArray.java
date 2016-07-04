package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_12_ReverseAnArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        reverse(numbers);

        System.out.println("The reverse is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }

    }

    public static void reverse(int[] numbers) {
        int lo = 0;
        int hi = numbers.length - 1;
        int temp;

        while (hi > lo) {
            temp = numbers[lo];
            numbers[lo] = numbers[hi];
            numbers[hi] = temp;

            lo++;
            hi--;
        }
    }

}

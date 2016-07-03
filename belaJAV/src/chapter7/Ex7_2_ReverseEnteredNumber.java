package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_2_ReverseEnteredNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get 10 integers
        int[] nums = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        // reverse entered number
        reverse(nums);

        // display result
        printNums(nums);
    }

    public static void reverse(int[] numbers) {
        int lo = 0;
        int hi = numbers.length - 1;
        int temp;

        while (hi > lo) {
            temp = numbers[lo];
            numbers[lo] = numbers[hi];
            numbers[hi] = temp;

            hi--;
            lo++;
        }

    }

    public static void printNums(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }

        System.out.println();
    }

}

package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/11/2016.
 */

public class Eg8_6_GuessingBirthday {

    public static void main(String[] args) {
        int day = 0;
        int answer;

        Scanner input = new Scanner(System.in);

        int[][][] dates = {
                {{1, 3, 5, 7},
                        {9, 11, 13, 15},
                        {17, 19, 21, 23},
                        {25, 27, 29, 31}},
                {{2, 3, 6, 7},
                        {10, 11, 14, 15},
                        {18, 19, 22, 23},
                        {26, 27, 30, 31}},
                {{4, 5, 6, 7},
                        {12, 13, 14, 15},
                        {20, 21, 22, 23},
                        {28, 29, 30, 31}},
                {{8, 9, 10, 11},
                        {12, 13, 14, 15},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}},
                {{16, 17, 18, 19},
                        {20, 21, 22, 23},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}}
        };

        for (int set = 0; set < 5; set ++) {
            System.out.println("Is your birthday in Set " + (set + 1) + "?");
            for (int row = 0; row < dates[set].length; row++) {
                for(int col =0;col<dates[set][row].length;col++) {
                    System.out.printf("%4d ", dates[set][row][col]);
                }
                System.out.println();
            }

            System.out.print("\nEnter 0 for No and 1 for Yes: ");
            answer = input.nextInt();

            if (answer == 1) {
                day += dates[set][0][0];
            }
        }

        System.out.println("Your birthday is " + day);

    }
}

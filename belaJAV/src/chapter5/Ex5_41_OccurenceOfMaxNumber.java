package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_41_OccurenceOfMaxNumber {

    public static void main(String[] args) {

        int max = 0;
        int maxCount = 0;
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        do {

            num = input.nextInt();

            if (num > max) {
                max = num;
                maxCount = 0;
            }

            maxCount = (num == max) ? maxCount + 1 : maxCount;

        } while (num != 0);

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + maxCount);

    }

}

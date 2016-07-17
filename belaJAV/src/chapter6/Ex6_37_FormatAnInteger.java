package chapter6;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_37_FormatAnInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter desired width: ");
        int width = input.nextInt();

        System.out.println("Here's your formatted number " +
                format(num, width));

    }

    public static String format(int number, int width) {

        // get number length
        int num = number;
        int numLength = 0;
        while (num > 0) {
            num /= 10;
            numLength++;
        }

        // number in string
        String formattedNum = number + "";

        // add zero
        if (width >= numLength) {
            for (int i = 0; i < width - numLength; i++) {
                formattedNum = 0 + formattedNum;
            }
        }

        return formattedNum;
    }
}

package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_8_SortThreeIntegers {

    public static void main(String[] args) {

        int temp = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("Your number in ascending order: " + num1 + ", " + num2 + ", " + num3);

    }
}

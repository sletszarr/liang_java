package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_2_AddThreeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);
        int sum = num1 + num2 + num3;

        System.out.print(num1 + " + " + num2 + " + " + num3 + " ? ");
        int answer = input.nextInt();

        if (answer == sum) {
            System.out.println("Your answer is correct");
        }
        else {
            System.out.println("Your answer is wrong");
        }

        System.out.println(num1 + " + " + num2 + " + " + num3 + " is " + sum);

    }

}


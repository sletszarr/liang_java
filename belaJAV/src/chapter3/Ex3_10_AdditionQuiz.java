package chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_10_AdditionQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num1 = rand.nextInt(99) + 1;
        int num2 = rand.nextInt(99) + 1;
        int sum = num1 + num2;

        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        if (sum == answer) {
            System.out.println("You are correct");
        }
        else {
            System.out.println("Your answer is wrong");
        }

        System.out.print(num1 + " + " + num2 + " is " + sum);

    }
}

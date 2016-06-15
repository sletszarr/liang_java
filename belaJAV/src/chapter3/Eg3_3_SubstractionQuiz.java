package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */
public class Eg3_3_SubstractionQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // if number 1 < number2, swap it to get a positive result
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.printf("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("You are correct");
        }
        else{
            System.out.println("Your answer is wrong.");
            System.out.printf("What is " + number1 + " - " + number2 + " is " + (number1 - number2));
        }

    }
}

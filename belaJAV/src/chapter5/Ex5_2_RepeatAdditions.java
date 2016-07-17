package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_2_RepeatAdditions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // set the number of questions
        final int NUMBER_OF_QUESTIONS = 15;

        // correct answer
        boolean isCorrect = true;

        // count correct answer
        int correctCount = 0;

        // iteration count
        int count = 0;

        // feedback
        String output = "";

        // start time
        long startTime = System.currentTimeMillis();

        while (count < NUMBER_OF_QUESTIONS) {

            // 1. generate random number between 1-15
            int num1 = (int) (1 + Math.random() * 15);
            int num2 = (int) (1 + Math.random() * 15);

            // 2. prompt the user for answer
            System.out.printf("What is %d + %d? ", num1, num2);
            int answer = input.nextInt();

            // 3. check answer
            isCorrect = (num1 + num2 == answer);
            if (isCorrect) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.printf("%d + %d should be %d\n", num1, num2, num1 + num2);
            }

            // 4. prepare feedback
            output += "\n" + num1 + "+" + num2 + "=" + (num1 + num2) +
                    ((isCorrect) ? " correct" : " wrong")
            ;

            // 5. increase count
            count++;

        }

        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime) / 1000;

        System.out.println("Correct count is " + correctCount);
        System.out.println("Test time is "+testTime+" seconds");
        System.out.println(output);

    }
}

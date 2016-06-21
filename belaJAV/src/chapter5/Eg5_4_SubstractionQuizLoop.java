package chapter5;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_4_SubstractionQuizLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // number of questions
        final int NUMBER_OF_QUESTIONS = 5;

        // number of correct questions
        int correctCount = 0;

        // questions count
        int count = 0;

        // feedback string
        String output = "";

        // start time
        long starTime = System.currentTimeMillis();

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. generate two random single digit integer
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // 2. make sure number1 is bigger than number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. prompt student to answer
            System.out.printf("What is %d - %d? ", number1, number2);
            int answer = input.nextInt();

            // 4. grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct");
                correctCount++;
            }
            else {
                System.out.printf("Your answer is wrong\n" +
                        "%d - %d should be %d", number1, number2, number1 - number2);
            }

            // 5. increase the question count
            count++;

            // 6. give feedback
            output += "\n" + number1 + "-" + number2 + "=" + "answer" +
                    ((number1 - number2 == answer) ? " correct" : " wrong");

        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - starTime;

        System.out.println("\nCorrect count is " + correctCount +
                        "\nTest time is " + testTime / 1000 + " seconds\n" + output
        );

    }
}

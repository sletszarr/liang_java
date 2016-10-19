package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 10/19/16.
 */

public class Ex11_16_AdditionQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> allAnswers = new ArrayList<Integer>();

        // prepare question
        int randNum1 = (int) (Math.random() * 10);
        int randNum2 = (int) (Math.random() * 10);
        int solution = randNum1 + randNum2;

        // get answer
        System.out.printf("What is %d + %d? ", randNum1, randNum2);
        int answer = input.nextInt();
        allAnswers.add(answer);

        while (answer != solution) {
            System.out.printf("Wrong answer. Try again. What is %d + %d? ", randNum1, randNum2);
            answer = input.nextInt();

            // check if answer is repeated
            if (allAnswers.contains(answer)) {
                System.out.printf("You already enter %d\n", answer);
            }

            // store answer to allAnswers
            allAnswers.add(answer);
        }

        System.out.println("You got it");

    }
}

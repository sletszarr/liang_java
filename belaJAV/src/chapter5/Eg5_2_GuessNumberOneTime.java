package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_2_GuessNumberOneTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 101);

        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("Enter your guess: ");
        int guessedNum = input.nextInt();

        if (randomNum == guessedNum) {
            System.out.println("Yes, the number is " + randomNum);
        }
        else if (randomNum < guessedNum) {
            System.out.println("Your guess is too high");
        }
        else {
            System.out.println("Your guess is too low");
        }

    }
}

package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Eg3_8_Lottery {

    public static void main(String[] args) {

        int lotteryNum = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (two digits): ");
        int guessNum = input.nextInt();

        // Get digits from lottery number
        int lotteryDigit1 = lotteryNum / 10;
        int lotteryDigit2 = lotteryNum % 10;


        // Get digits from guesses number
        int guessDigit1 = guessNum / 10;
        int guessDigit2 = guessNum % 10;

        if (guessNum == lotteryNum) {
            System.out.println("Exact match: you win $10,000!");
        }

        else if (lotteryDigit1 == guessDigit2
                && lotteryDigit2 == guessDigit1) {
            System.out.println("Match all digits: you win $3,000");
        }

        else if (lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit2
                || lotteryDigit2 == guessDigit1
                || lotteryDigit2 == guessDigit2) {
            System.out.println("Match one digit: you win $1,000");
        }

        else {
            System.out.println("Sorry no match!");
        }
    }
}

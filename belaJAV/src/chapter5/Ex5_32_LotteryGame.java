package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_32_LotteryGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2 = (int) (Math.random() * 10);

        while (lotteryDigit1 == lotteryDigit2) {
            lotteryDigit2 = (int) (Math.random() * 10);
        }

        int lotteryNum = lotteryDigit1 * 10 + lotteryDigit2;

        System.out.print("Enter your lottery pick (two digits): ");
        int guessNum = input.nextInt();

        int guessDigit1 = guessNum / 10;
        int guessDigit2 = guessNum % 10;

        if (lotteryNum == guessNum) {
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

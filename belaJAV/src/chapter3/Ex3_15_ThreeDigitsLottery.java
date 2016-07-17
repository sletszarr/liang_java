package chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_15_ThreeDigitsLottery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int lotteryNum = rand.nextInt(900)+100;

        System.out.print("Enter your lottery pick (three digits): ");
        int guessNum = input.nextInt();

        // Get digits from lottery number
        int lotteryDigit1 = lotteryNum / 100;
        int lotteryDigit2 = (lotteryNum / 10) % 10;
        int lotteryDigit3 = lotteryNum % 10;

        // Get digits from guess number
        int guessDigit1 = guessNum / 100;
        int guessDigit2 = (guessNum / 10) % 10;
        int guessDigit3 = guessNum % 10;

        if (guessNum == lotteryNum) {
            System.out.println("Exact match: you win $10,000");
        }
        else if ((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3)
                && (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3)
                && (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if (lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit2
                || lotteryDigit1 == guessDigit3
                || lotteryDigit2 == guessDigit1
                || lotteryDigit2 == guessDigit2
                || lotteryDigit2 == guessDigit3
                || lotteryDigit3 == guessDigit1
                || lotteryDigit3 == guessDigit2
                || lotteryDigit3 == guessDigit3) {
            System.out.println("Match one digit: you win $1,000");

        }
        else {
            System.out.println("Sorry no match!");
        }

    }
}

package chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_17_RockScissorPaper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] hands = {"Scissor", "Rock", "Paper"};

        // game state
        boolean computerWin = false;
        boolean draw = false;

        // computer pick a hand
        int computerHand = (int) (Math.random() * 3);
        computerHand = 2;

        // user pick a hand
        System.out.print("" +
                "(0) Scissor\n" +
                "(1) Rock\n" +
                "(2) Paper\n" +
                "Pick your hand: ");
        int userHand = input.nextInt();

        // determine the winner
        if (computerHand == userHand) {
            draw = true;
        }
        else if (computerHand < userHand) {
            computerWin = (computerHand == 0 && userHand == 2);
        }
        else {
            computerWin = (computerHand != 2 || userHand != 0);
        }


        // display result
        if (draw) {
            System.out.println("It's a draw" +
                            "\nComputer is " + hands[computerHand] +
                            "\nUser hand is " + hands[userHand]
            );
        }
        else if (computerWin) {
            System.out.println("You lose" +
                    "\nComputer is " + hands[computerHand] +
                    "\nYou are " + hands[userHand]);
        }
        else {
            System.out.println("You win" +
                    "\nComputer is " + hands[computerHand] +
                    "\nYou are " + hands[userHand]);
        }

    }
}

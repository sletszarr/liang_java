package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_34_ScissorRockPaper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] hands = {"Scissor", "Rock", "Paper"};

        // win count
        int computerWinCount = 0;
        int userWinCount = 0;

        // game state
        boolean computerWin = false;
        boolean draw = false;
        boolean gameOver = false;

        while (!gameOver) {

            // computer pick a hand
            int computerHand = (int) (Math.random() * 3);


            // user pick a hand
            System.out.print("" +
                    "(0) scissor\n" +
                    "(1) rock\n" +
                    "(2) paper\n" +
                    "Pick your hand: ");
            int userHand = input.nextInt();


            // determine the winner
            draw = false;
            computerWin = false;

            if (computerHand == userHand) {
                draw = true;
            }
            else if (computerHand > userHand) {
                if (computerHand == 2 && userHand == 0) {
                    userWinCount++;
                }
                else {
                    computerWinCount++;
                    computerWin = true;
                }
            }
            else {
                if (computerHand == 0 && userHand == 2) {
                    computerWinCount++;
                    computerWin = true;
                }
                else {
                    userWinCount++;
                }
            }


            // display win/lose/draw
            System.out.println();
            if (draw) {
                System.out.println("It's a draw.\n" +
                        "Both the computer and you chose " + hands[userHand]);
            }
            else if (computerWin) {
                System.out.println("You lose.\n" +
                        "Computer is " + hands[computerHand] + " and You are " + hands[userHand]);

            }
            else {
                System.out.println("You win.\n" +
                        "Computer is " + hands[computerHand] + " and You are " + hands[userHand]);
            }


            // display win count
            System.out.println();
            System.out.printf("Computer: %d win\n", computerWinCount);
            System.out.printf("User: %d win\n", userWinCount);


            // print separator
            System.out.println("\n===================================\n");


            // is it game over?
            if (Math.min(computerWinCount, userWinCount) == 0) {
                gameOver = (Math.max(computerWinCount, userWinCount) == 3);
            }
            else {
                gameOver = (Math.max(computerWinCount, userWinCount) >
                        2 * Math.min(computerWinCount, userWinCount)
                );
            }

        }

    }
}
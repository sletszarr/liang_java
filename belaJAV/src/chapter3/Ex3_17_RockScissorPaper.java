package chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_17_RockScissorPaper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int computerHand = rand.nextInt(3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userHand = input.nextInt();

        switch (userHand) {
            case 0:
                if (computerHand == 0) {
                    System.out.println("The computer is scissor. You are scissor. It is a draw");
                } else if (computerHand == 1) {
                    System.out.println("The computer is rock. You are scissor. You lost");
                } else {
                    System.out.println("The computer is paper. You are scissor. You won");
                }
                break;
            case 1:
                if (computerHand == 0) {
                    System.out.println("The computer is scissor. You are rock. You won");
                } else if (computerHand == 1) {
                    System.out.println("The computer is rock. You are rock. It is a draw");
                } else {
                    System.out.println("The computer is paper. You are rock. You lost");
                }
                break;
            case 2:
                if (computerHand == 0) {
                    System.out.println("The computer is scissor. You are paper. You lost");
                } else if (computerHand == 1) {
                    System.out.println("The computer is rock. You are paper. You won");
                } else {
                    System.out.println("The computer is paper. You are paper. It is a draw");
                }
                break;
            default:
                System.out.println("Your input is not valid");
                System.exit(1);
        }

    }
}

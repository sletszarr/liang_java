package chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_14_HeadOrTails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int computerFlip = rand.nextInt(2);

        System.out.print("Head(0) or Tail(1): ");
        int guessFlip = input.nextInt();

        if (guessFlip == computerFlip) {
            System.out.println("Your guess is right");
        }
        else {
            System.out.println("Your guess is wrong");
        }

    }
}

package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/5/2016.
 */

public class Ex7_21_BeanMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get total balls
        System.out.print("Enter the number of balls to drop: ");
        int totalBalls = input.nextInt();

        // get total slots
        System.out.print("Enter the number of slots in the bean machine: ");
        int totalSlots = input.nextInt();

        // prepare slot's holder
        int[] slots = new int[totalSlots];

        // drop the ball
        for(int i =0;i<totalBalls;i++) {
            dropTheBallTo(slots);
        }

        // display result
        displaySlot(slots);

    }

    public static void dropTheBallTo(int[] slots) {

        int destination = 0;
        int fallsDirection;

        for (int i = 0; i < slots.length; i++) {
            fallsDirection = (int) (Math.random() * 2);
            System.out.print((fallsDirection == 1) ? "R" : "L");
            destination += fallsDirection;
        }

        System.out.println();
        slots[destination]++;

    }

    public static void displaySlot(int[] slots) {

        System.out.println();

        // print slot's body
        for (int i = maximumBallsInASlot(slots); i > 0; i--) {

            for (int k = 0; k < slots.length; k++) {
                // print the left most wall
                if (k == 0) {
                    System.out.print((slots[k] >= i) ? "| o |" : "|   |");
                }
                // print the ball and the wall
                else {
                    System.out.print((slots[k] >= i) ? " o |" : "   |");
                }
            }
            System.out.println();
        }

        // print slot's index
        for (int i = 0; i < slots.length; i++) {
            System.out.printf("  %d ", i);
        }

    }

    public static int maximumBallsInASlot(int[] slots) {

        int maxBallsInASlot = slots[0];

        for (int totalBalls : slots) {
            if (totalBalls > maxBallsInASlot) {
                maxBallsInASlot = totalBalls;
            }
        }

        return maxBallsInASlot;
    }
}

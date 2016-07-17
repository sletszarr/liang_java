package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_10_FutureTuition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input your current tuition: ");
        double currentTuition = input.nextDouble();

        System.out.print("Input tuition increase rate in percentage (e.g. 7): ");
        double increaseRate = (input.nextDouble()) / 100;

        int year = 0;
        double tuition = currentTuition;

        while (tuition < currentTuition * 2) {
            tuition = tuition * (1 + increaseRate);
            year++;
        }

        System.out.println("Tuition will be doubled in " +
                year + " years");
        System.out.printf("By that time, your tuition will be $%.2f", tuition);

    }
}

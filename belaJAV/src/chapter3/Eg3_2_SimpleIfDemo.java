package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 */

public class Eg3_2_SimpleIfDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("Hi Five");
        }

        if (number % 2 == 0) {
            System.out.println("Hi Even");
        }

    }
}

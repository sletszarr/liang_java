package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Financial application: calculate tips)
 * Write a program that reads the subtotal and the gratuity rate,
 * then computes the gratuity and total.
 *
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate,
 * the program displays $1.5 as gratuity and $11.5 as total.
 *
 */

public class Ex2_5_CalculateTips {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subTotal * gratuityRate / 100;
        double total = subTotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}

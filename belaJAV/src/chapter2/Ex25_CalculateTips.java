package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */

public class Ex25_CalculateTips {

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

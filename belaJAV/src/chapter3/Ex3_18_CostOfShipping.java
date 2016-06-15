package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_18_CostOfShipping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of your package: ");
        int packageWeight = input.nextInt();

        double shippingCost = 0;

        if (packageWeight <= 0) {
            System.out.println("Please enter a valid weight");
            System.exit(1);
        }
        else if (packageWeight <= 1) {
            shippingCost = 3.5;
        }
        else if (packageWeight <= 3) {
            shippingCost = 5.5;
        }
        else if (packageWeight <= 10) {
            shippingCost = 8.5;
        }
        else if (packageWeight <= 20) {
            shippingCost = 10.5;
        }
        else {
            System.out.println("The package can not be shiiped");
            System.exit(1);
        }

        System.out.println("The shipping cost is " + shippingCost);
    }
}

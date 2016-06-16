package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_33_CompareCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight and price for package 1: ");
        double weightOfPackage1 = input.nextDouble();
        double priceOfPackage1 = input.nextDouble();

        System.out.print("Enter the weight and price for package 2: ");
        double weightOfPackage2 = input.nextDouble();
        double priceOfPackage2 = input.nextDouble();

        System.out.println((weightOfPackage1 / priceOfPackage1 > weightOfPackage2 / priceOfPackage2) ?
                "Package 1 has a better price" : "Package 2 has a better price");

    }

}


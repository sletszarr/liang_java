package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class Ex2_3_FeetToMeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feetVal = input.nextDouble();

        double meterVal = feetVal * 0.305;
        System.out.println(feetVal + " feet is " + meterVal + " meters");

    }
}

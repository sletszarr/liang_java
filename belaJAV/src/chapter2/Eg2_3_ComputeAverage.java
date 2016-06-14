package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class Eg2_3_ComputeAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter 3 numbers: ");
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        double thirdNum = input.nextDouble();

        double average = (firstNum + secondNum + thirdNum) / 3;

        System.out.println("the average of " + firstNum + ", " + secondNum + ", and " + thirdNum + " is " + average);

    }
}

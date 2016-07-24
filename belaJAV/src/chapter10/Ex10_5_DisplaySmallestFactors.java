package chapter10;

import chapter10.Eg10_78_StackOfIntegers.StackOfIntegers;

import java.util.Scanner;

/**
 * Created by bnamora on 7/24/16.
 */

public class Ex10_5_DisplaySmallestFactors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // find and display factor
        displayFactor(findSmallestFactors(num));

    }

    public static StackOfIntegers findSmallestFactors(int num) {

        StackOfIntegers smallestFactors = new StackOfIntegers();
        int factor = 2;

        while (num > 1) {
            if (num % factor == 0) {
                smallestFactors.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }

        return smallestFactors;
    }

    public static void displayFactor(StackOfIntegers factors) {
        while (!factors.isEmpty()) {
            System.out.print(factors.pop()+" ");
        }
    }

}

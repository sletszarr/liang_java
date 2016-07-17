package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_17_DisplayMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);

    }


    public static void printMatrix(int n) {

        for (int k = 0; k < n; k++) {

            for (int l = 0; l < n; l++) {
                System.out.printf("%2d", (int) (Math.random() * 2));
            }

            System.out.println();
        }
    }
}

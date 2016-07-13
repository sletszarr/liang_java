package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/14/2016.
 */

public class Ex8_11_NineHeadsAndTails {

    public static void main(String[] args) {

        // get num from user
        int num = getNum();

        // get binary matrix from num
        int[][] matrix = getBinaryMatrixFrom(num);

        // display binary matrix
        // in a form of H(0) and T(1)
        displayHeadTail(matrix);

    }

    public static int getNum() {
        Scanner input = new Scanner(System.in);

        int num;
        boolean outOfRange;

        do {
            // get num from user
            System.out.print("Enter a number between " +
                    "0 and 511: ");
            num = input.nextInt();

            // check whether num is out of range
            outOfRange = num < 0 || num > 511;
            if (outOfRange) {
                System.out.println("The number you've inputted " +
                        "is out of range");
            }
        } while (outOfRange);

        return num;
    }

    public static int[][] getBinaryMatrixFrom(int num) {
        int[][] binMatrix = new int[3][3];
        for (int row = binMatrix.length - 1; row >= 0; row--) {
            for (int col = binMatrix[row].length - 1; col >= 0; col--) {
                binMatrix[row][col] = num % 2;
                num /= 2;
            }
        }
        return binMatrix;
    }

    public static void displayHeadTail(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print((matrix[row][col] == 0) ? "H " : "T ");
            }
            System.out.println();
        }
    }


}

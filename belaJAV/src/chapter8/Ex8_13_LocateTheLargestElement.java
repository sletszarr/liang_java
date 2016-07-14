package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/14/2016.
 */

public class Ex8_13_LocateTheLargestElement {

    public static void main(String[] args) {

        double[][] array = getArray();
        int[] index = getIndexOfTheLargestElement(array);

        System.out.printf("The location of the largest element " +
                "is at (%d, %d)", index[0], index[1]);

    }

    public static double[][] getArray() {

        Scanner input = new Scanner(System.in);

        // get row & col
        System.out.print("Enter the number of " +
                "rows and columns of the array: ");
        int totalRow = input.nextInt();
        int totalCol = input.nextInt();

        // create array
        double[][] array = new double[totalRow][totalCol];

        // get values
        System.out.println("Enter the array: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }

        }

        // return array
        return array;

    }

    public static int[] getIndexOfTheLargestElement(double[][] array) {

        double largestEl = array[0][0];
        int rowIndex = 0;    // of the largest el
        int colIndex = 0;    // of the largest el

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > largestEl) {
                    largestEl = array[row][col];
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }

        return new int[]{rowIndex, colIndex};

    }

}

package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/10/2016.
 */
public class Eg8_1_PassTwoDimensionalArray {

    public static void main(String[] args) {

        int[][] m = getArray();

        // display sum of all elements
        System.out.println("Sum of all elements is " + sum(m));

    }

    public static int[][] getArray() {

        Scanner input = new Scanner(System.in);

        // prepare 2 dimensional array
        int[][] m = new int[3][4];

        // get array value from user
        System.out.println("Enter " + m.length + " rows and "
                + m[0].length + " columns:");
        for (int row = 0; row < m.length; row++) {
            for(int col =0;col<m[row].length;col++) {
                m[row][col] = input.nextInt();
            }
        }

        return m;
    }

    public static int sum(int[][] array) {

        // prepare sum holder
        int sum = 0;

        // sum all item in array
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
            }
        }

        return sum;

    }

}

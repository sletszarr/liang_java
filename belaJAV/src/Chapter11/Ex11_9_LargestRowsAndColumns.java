package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 10/18/16.
 */

public class Ex11_9_LargestRowsAndColumns {

    public static void main(String[] args) {

        // Get Array Size
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = input.nextInt();

        // Create Array with random 0s and 1s
        int[][] randomArray = getRandomArray(arraySize);

        // Print Array
        printArray(randomArray);

        // Find the largest rows and columns
        printLargestRowsAndCols(randomArray);
    }

    public static int[][] getRandomArray(int n) {
        int[][] randomArray = new int[n][n];

        for (int row = 0; row < randomArray.length; row++) {
            for (int col = 0; col < randomArray[row].length; col++) {
                randomArray[row][col] = (int) (Math.random() * 2);
            }
        }

        return randomArray;
    }

    public static void printArray(int[][] randomArray) {
        for (int row = 0; row < randomArray.length; row++) {
            for (int col = 0; col < randomArray[row].length; col++) {
                System.out.printf("%d ", randomArray[row][col]);
            }
            System.out.println();
        }
    }



    public static void printLargestRowsAndCols(int[][] randomArray) {
        ArrayList<Integer> largestRows = new ArrayList<Integer>();
        ArrayList<Integer> largestCols = new ArrayList<Integer>();

        // prepare sum container
        int maxSum;
        int sumOf1s;

        // get the largest row
        maxSum = 0;
        for (int row = 0; row < randomArray.length; row++) {
            sumOf1s = 0;
            for (int col = 0; col < randomArray[row].length; col++) {
                sumOf1s += randomArray[row][col];
            }

            if (sumOf1s > maxSum) {
                // update maxSum
                maxSum = sumOf1s;

                // clear previous largest rows list
                largestRows.clear();
            }

            if (sumOf1s == maxSum) {
                // add row index to the list of largest rows
                largestRows.add(row);
            }

        }
        // print largest rows' index
        System.out.println("The largest row index: " + largestRows.toString());


        // get the largest col
        maxSum = 0;
        for (int col = 0; col < randomArray[0].length; col++) {
            sumOf1s = 0;
            for (int row = 0; row < randomArray.length; row++) {
                sumOf1s += randomArray[row][col];
            }

            if (sumOf1s > maxSum) {
                // update maxSum
                maxSum = sumOf1s;

                // clear previous largest cols list
                largestCols.clear();
            }

            if (sumOf1s == maxSum) {
                // add col index to the list of largest cols
                largestCols.add(col);
            }
        }
        // print largest cols' index
        System.out.println("The largest col index: " + largestCols.toString());

    }


}

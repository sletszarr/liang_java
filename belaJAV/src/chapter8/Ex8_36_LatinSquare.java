package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_36_LatinSquare {

    public static void main(String[] args) {

        // get array from user
        char[][] array = getArray();

        // display whether
        // the array is a latin square
        System.out.println("The input array is " +
                ((isLatinSquare(array)) ? "" : "not ") +
                "a latin square");

    }

    public static char[][] getArray() {

        Scanner input = new Scanner(System.in);

        // get array's size
        System.out.print("Enter number n: ");
        int n = input.nextInt();

        // prepare array
        char[][] array = new char[n][n];

        // initialize array
        System.out.printf("Enter %d rows of letters " +
                "separated by spaces\n", n);
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                // get values
                array[row][col] = input.next().charAt(0);

                // make sure inputted char is within range
                if (array[row][col] < 65
                        || array[row][col] > (65 + n - 1)) {
                    System.out.printf("Wrong input: " +
                                    "the letters must be from %c to %c",
                            65, 65 + n - 1);
                    System.exit(1);
                }
            }
        }

        return array;
    }

    public static boolean isLatinSquare(char[][] array) {
        return hasDistinctCharInEachRow(array) &&
                hasDistinctCharInEachCol(array);
    }

    public static boolean hasDistinctCharInEachRow(char[][] array) {

        int charOuterBound = 65 + array.length - 1;

        for (int row = 0; row < array.length; row++) {
            // prepare char counter
            char[] charCounter = new char[array.length];

            // count char appearance in row #row
            for (int col = 0; col < array[row].length; col++) {
                charCounter[charOuterBound - array[row][col]]++;
            }

            // inspect char counter
            for (int count : charCounter) {
                if (count != 1)
                    return false;
            }
        }

        return true;
    }

    public static boolean hasDistinctCharInEachCol(char[][] array) {

        int charOuterBound = 65 + array.length - 1;

        for (int col = 0; col < array[0].length; col++) {
            // prepare char counter
            char[] charCounter = new char[array.length];

            // count char appearance in col #col
            for (int row = 0; row < array.length; row++) {
                charCounter[charOuterBound - array[row][col]]++;
            }

            // inspect char counter
            for (int count : charCounter) {
                if (count != 1)
                    return false;
            }
        }

        return true;
    }
}

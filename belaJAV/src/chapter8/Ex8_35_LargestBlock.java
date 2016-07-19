package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_35_LargestBlock {

    public static void main(String[] args) {

        // get matrix from user
        int[][] matrix = getMatrix();

        // display largest block
        displayLargestBlock(matrix);

    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int length = input.nextInt();

        int[][] m = new int[length][length];

        System.out.println("Enter the matrix row by row: ");
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextInt();
                if (m[row][col] != 0 || m[row][col] != 1) {
                    System.out.println("The matrix can only" +
                            " consists of 0s and 1s");
                    System.exit(1);
                }
            }
        }

        return m;

    }

    public static void displayLargestBlock(int[][] m) {

        if (findLargestBlock(m)[2] == 1) {
            System.out.println("\nThe matrix above " +
                    "doesn't contain any block of 1s");
        } else {
            System.out.printf("\nThe maximum square submatrix " +
                            "is at (%d,%d) with size %d",
                    findLargestBlock(m)[0],
                    findLargestBlock(m)[1],
                    findLargestBlock(m)[2]);
        }
    }

    public static int[] findLargestBlock(int[][] m) {

        int[] largestBlock = {0, 0, 1};

        for (int startRow = 0; startRow < m.length; startRow++) {
            for (int startCol = 0; startCol < m[startRow].length; startCol++) {

                // if a cell contains 1
                if (m[startRow][startCol] == 1) {

                    // find a block starting from this cell
                    int[] block = findBlock(startRow, startCol, m);

                    // if a block is found, and its size
                    // is larger than the largest block
                    if (block[2] > largestBlock[2]) {

                        // copy block to largestBlock
                        largestBlock[0] = block[0];
                        largestBlock[1] = block[1];
                        largestBlock[2] = block[2];
                    }
                }
            }
        }

        return largestBlock;
    }

    private static int[] findBlock(
            int startingRow, int startingCol, int[][] m) {

        int[] block = {startingRow, startingCol, 1};

        boolean blockIsFound = true;

        for (int endingRow = startingRow + 1, endingCol = startingCol + 1;
             endingRow < m.length && endingCol < m[0].length;
             endingRow++, endingCol++) {

            // scan array
            // from (startingRow, startingCol)
            // to (endingRow, endingCol)
            for (int row = startingRow; row <= endingRow; row++) {
                for (int col = startingCol; col <= endingCol; col++) {
                    if (m[row][col] != 1) {
                        blockIsFound = false;
                        break;
                    }
                }
            }

            // if blockIsFound still true
            // increase the size
            // then, the loop will continue
            // with the new
            // (endingRow, endingCol)
            if (blockIsFound) {
                block[2]++;
            }

            // if blockIsFound is false now
            // break the loop
            else {
                break;
            }

        }

        return block;

    }

}

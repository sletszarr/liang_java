package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/11/2016.
 */

public class Eg8_4_CheckSudokuSolution {

    public static void main(String[] args) {

        int[][] solution = getSolution();

        System.out.println("Your solution is " +
                ((isValid(solution)) ? "valid" : "invalid"));

    }

    public static int[][] getSolution() {

        int[][] solution = {
                {9, 6, 3, 1, 7, 4, 2, 5, 8},
                {1, 7, 8, 3, 2, 5, 6, 4, 9},
                {2, 5, 4, 6, 8, 9, 7, 3, 1},
                {8, 2, 1, 4, 3, 7, 5, 9, 6},
                {4, 9, 6, 8, 5, 2, 3, 1, 7},
                {7, 3, 5, 9, 6, 1, 8, 2, 4},
                {5, 8, 9, 7, 1, 3, 4, 6, 2},
                {3, 1, 7, 2, 4, 6, 9, 8, 5},
                {6, 4, 2, 5, 9, 8, 1, 7, 3}
        };

        return solution;
    }


    public static int[][] readSolution() {

        Scanner input = new Scanner(System.in);
        int[][] solution = new int[9][9];

        System.out.println("Enter a Sudoku puzzle solution: ");
        for (int row = 0; row < solution.length; row++) {
            for(int col = 0;col<solution[row].length;col++) {
                solution[row][col] = input.nextInt();
            }
        }

        return solution;
    }

    public static boolean isValid(int[][] solution) {
        return allRowIsValid(solution) && allColIsValid(solution)
                && allGridIsValid(solution);
    }

    public static boolean allRowIsValid(int[][] solution) {

        for (int row = 0; row < solution.length; row++) {

            int[] numbers = new int[9];

            for (int col = 0; col < solution[row].length; col++)
                numbers[solution[row][col] - 1]++;

            if (!validNumCount(numbers))
                return false;
        }

        return true;
    }

    public static boolean allColIsValid(int[][] solution) {

        for (int col = 0; col < solution.length; col++) {
            int[] numbers = new int[9];

            for (int row = 0; row < solution.length; row++)
                numbers[solution[row][col] - 1]++;

            if (!validNumCount(numbers))
                return false;
        }

        return true;

    }

    public static boolean allGridIsValid(int[][] solution) {

        for (int grid = 0; grid < 9; grid++) {

            int[] numbers = new int[9];

            for (int row = grid / 3 * 3; row < (grid / 3 + 1) * 3; row++) {
                for (int col = grid % 3 * 3; col < (grid % 3 + 1) * 3; col++) {
                    numbers[solution[row][col] - 1]++;
                }
            }

            if (!validNumCount(numbers))
                return false;
        }

        return true;
    }

    public static boolean validNumCount(int[] numCounter) {
        for (int num : numCounter) {
            if (num != 1)
                return false;
        }
        return true;
    }

}

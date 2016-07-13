package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/13/2016.
 */

public class Ex8_9_TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        char nowPlaying = 'Y';
        boolean win = false;
        boolean boardIsAvailable = true;

        while(!win & boardIsAvailable){
            displayBoard(board);

            // change player
            nowPlaying = (nowPlaying == 'X') ? 'Y' : 'X';

            // get row col index
            int[] index = getRowColIndex(nowPlaying, board);
            int row = index[0];
            int col = index[1];

            // mark board with player
            // on the inputted row and col index
            board[row][col] = nowPlaying;

            // check if nowPlaying win
            win = isWinning(row, col, nowPlaying, board);

            // check if board is still available
            boardIsAvailable = isBoardAvailable(board);
        }

        displayBoard(board);
        System.out.println((win) ? nowPlaying + " player won" : "It's a draw");
    }

    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                System.out.printf(
                        (board[i][k] == 0) ? "|   " : "| %c ", board[i][k]
                );
            }
            System.out.print("|\n");
            System.out.println("-------------");
        }
    }

    public static int[] getRowColIndex(char nowPlaying, char[][] board) {

        int row, col;
        boolean isOccupied, isOutOfRange;

        Scanner input = new Scanner(System.in);

        do {

            do {

                // get row index
                System.out.printf("Enter a row (0, 1, or 2) " +
                        "for player %c: ", nowPlaying);
                row = input.nextInt();

                // get col index
                System.out.printf("Enter a column (0, 1, or 2) " +
                        "for player %c: ", nowPlaying);
                col = input.nextInt();

                // check whether row/col index is out of range
                isOutOfRange = row < 0 || row >= board.length
                        || col < 0 || col >= board.length;

                if (isOutOfRange)
                    System.out.println("The row/col index you've inputted is out of range");

            } while (isOutOfRange);

            // check whether (row, col) is occupied
            isOccupied = board[row][col] != 0;

            if (isOccupied)
                System.out.printf("(%d, %d) is occupied\n", row, col );

        } while (isOccupied);

        return new int[]{row, col};

    }

    public static boolean isBoardAvailable(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0)
                    return true;
            }
        }
        return false;
    }

    public static boolean isWinning(
            int row, int col, char nowPlaying, char[][] board) {

        // check vertical match
        boolean matchVertical = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != nowPlaying)
                matchVertical = false;
        }

        // check horizontal match
        boolean matchHorizontal = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != nowPlaying)
                matchHorizontal = false;
        }

        // check left to right diagonal
        boolean matchLTR = true;

        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != nowPlaying)
                matchLTR = false;
        }

        // check right to left diagonal
        boolean matchRTL = true;
        for (int i = 0, j = board.length - 1;
             i < board.length && j >= 0; i++, j--) {
            if (board[i][j] != nowPlaying)
                matchRTL = false;
        }

        return matchHorizontal || matchVertical || matchLTR || matchRTL;

    }


}

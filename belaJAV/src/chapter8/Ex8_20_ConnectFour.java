package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/17/16.
 */

public class Ex8_20_ConnectFour {

    public static void main(String[] args) {

        char[][] board = new char[5][6];
        int status = 0; // 0 for play
                        // 1 for win
                        // 2 for draw
        char player = 'Y';

        while (status == 0) {

            // change player
            player = (player == 'R') ? 'Y' : 'R';

            // display board
            displayBoard(board);

            // get col from player
            int col = getColFromPlayer(player, board);

            // drop disk to the board
            dropDisk(player, col, board);

            // redefine status
            status = (isPlayerWin(player, board) ? 1 :
                    (boardIsFull(board) ? 2 : 0)
            );

        }

        displayBoard(board);
        if (status == 2) {
            System.out.println("It's a draw");
        }
        else {
            System.out.println("The " +
                    ((player == 'R') ? "red" : "yellow") +
                    " player won");
        }

    }

    public static void displayBoard(char[][] board) {

        System.out.println();
        for (int row = 0; row < board.length; row++) {
            System.out.print("|");

            for (int col = 0; col < board[row].length; col++) {
                System.out.print((board[row][col] == 0) ? " |" : board[row][col] + "|");
            }

            System.out.println();
        }

    }

    public static int getColFromPlayer(char player, char[][] board) {

        Scanner input = new Scanner(System.in);

        int col;

        do {
            // get column
            System.out.print("Drop a " +
                    ((player == 'R') ? "red" : "yellow") +
                    " disk at column (0-" + (board[0].length - 1) + "): ");

            col = input.nextInt();

            // make sure selected col is within range
            if (col < 0 || col > board[0].length - 1) {
                System.out.println("You can only drop a disk on column 0-" +
                        (board[0].length - 1));
            }

        } while (col < 0 || col > board[0].length - 1);

        return col;

    }

    public static void dropDisk(char player, int col, char[][] board) {

        for (int row = board.length - 1; row >= 0; row--) {
            if (board[row][col] == 0) {
                board[row][col] = player;
                break;
            }
        }

    }

    public static boolean boardIsFull(char[][] board) {

        boolean full = true;

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0) {
                    full = false;
                }
            }
        }

        return full;

    }

    public static boolean isPlayerWin(char player, char[][] board) {

        return isMatchingRow(player, board) ||
                isMatchingCol(player, board) ||
                isMatchingDiagonal(player, board);

    }

    public static boolean isMatchingRow(char player, char[][] board) {

        for (int row = board.length - 1; row >= 0; row--) {
            int matchCount = 0;

            for (int col = 0; col < board[row].length; col++) {

                // if board[row][col] == 'player'
                // increase match count
                // otherwise, reset it to 0
                matchCount = (board[row][col] == player) ? matchCount + 1 : 0;

                if (matchCount == 4) return true;
            }

        }

        return false;

    }

    public static boolean isMatchingCol(char player, char[][] board) {

        for (int col = 0; col < board[0].length; col++) {
            int matchCount = 0;

            for (int row = board.length - 1; row >= 0; row--) {

                // if board[row][col] == 'player'
                // increase match count
                // otherwise, reset it to 0
                matchCount = (board[row][col] == player) ? matchCount + 1 : 0;

                if (matchCount == 4) return true;
            }
        }

        return false;
    }

    public static boolean isMatchingDiagonal(char player, char[][] board) {

        int startingRow;

        // check left to right diagonal
        startingRow = board.length - 4;
        for (int startingCol = 0; startingCol <= board[0].length - 4; startingCol++) {

            while (startingRow != 0) {
                if (matchLTR(startingRow, startingCol, player, board))
                    return true;
                startingRow--;
            }

            if (matchLTR(startingRow, startingCol, player, board))
                return true;

        }

        // check right to left diagonal
        startingRow = board.length - 4;
        for (int startingCol = board[0].length - 1; startingCol >= 3; startingCol--) {

            while (startingRow != 0) {
                if (matchRTL(startingRow, startingCol, player, board))
                    return true;
                startingRow--;
            }

            if (matchRTL(startingRow, startingCol, player, board))
                return true;

        }


        return false;
    }

    public static boolean matchLTR(
            int startingRow, int startingCol, char player, char[][] board) {

        int matchCount = 0;

        for (int row = startingRow, col = startingCol;
             row < board.length && col < board[0].length;
             row++, col++) {

            // if board[row][col] == 'player'
            // increase match count
            // otherwise, reset it to 0
            matchCount = (board[row][col] == player) ? matchCount + 1 : 0;

            if (matchCount == 4) return true;
        }

        return false;
    }

    public static boolean matchRTL(
            int startingRow, int startingCol, char player, char[][] board) {

        int matchCount = 0;

        for (int row = startingRow, col = startingCol;
             row < board.length && col >= 0;
             row++, col--) {

            // if board[row][col] == 'player'
            // increase match count
            // otherwise, reset it to 0
            matchCount = (board[row][col] == player) ? matchCount + 1 : 0;

            if (matchCount == 4) return true;
        }

        return false;
    }

}

package chapter7;

/**
 * Created by Acer-756 on 7/7/2016.
 */
public class Ex7_22_TheEightQueen {

    public static void main(String[] args) {

        // create board
        char[] board = new char[64];
        int row = 0;

        // create blacklist
        int[] blacklist = new int[100];

        // create queen index holder
        // to be used for backtracking
        int[] queenIndex = new int[8];

        // initialize board and blacklist
        initialize(board, blacklist, queenIndex);

        while (row < 8) {

            if (rowIsAvailable(row, board, blacklist)) {
                boolean inBacktrakcingMode = true;

                // get a random queen index on this row
                if (queenIndex[row] == -1) {
                    queenIndex[row] = getIndexInARandomColumn(row, board, blacklist);
                    inBacktrakcingMode = false;
                }

                // put queen on the board
                board[queenIndex[row]] = 'Q';

                // disable attacking cell
                disableAttackingCell(queenIndex[row], board);

                // display board
                if (!inBacktrakcingMode)
                    displayBoard(board);

                // go to next row
                row++;
            }

            else {
                // if this is the first row,
                // and it's already unavailable
                if (row == 0) {
                    System.out.println("Can't find solution. Starting over..");
                    initialize(board, blacklist, queenIndex);
                }
                // if this row is unavailable
                else {
                    // blacklist queen index on previous row
                    pushToBlacklist(queenIndex[row-1], blacklist);

                    // display blacklisted cell
                    displayBlacklistedCell(blacklist);

                    // change queen on previous row to default value
                    board[queenIndex[row-1]] = '-';
                    queenIndex[row-1] = -1;

                    // backtrack
                    System.out.println("Backtracking now..");
                    initializeBoard(board);
                    row = 0;
                }

            }

        }

    }


    public static void initialize(char[] board, int[] blacklist, int[] queenIndex) {
        initializeBoard(board);
        initializeWithMin1AsDefaultVal(blacklist);
        initializeWithMin1AsDefaultVal(queenIndex);
    }

    public static void initializeBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
    }

    // initialize an array that's used for saving index
    public static void initializeWithMin1AsDefaultVal(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // use -1 instead of 0
            // to avoid confusion with index 0
            array[i] = -1;
        }
    }

    // return true if a row has an empty column that's not blacklisted
    public static boolean rowIsAvailable(int row, char[] board, int[] blacklist) {
        for (int i = getIndex(row, 0); i < getIndex(row + 1, 0); i++) {
            if (board[i] == '-' && !indexIsBlacklisted(i, blacklist)) {
                return true;
            }
        }
        return false;
    }

    // get column from a (board) index
    public static int getColumn(int index) {
        return index % 8;
    }

    // get row from a (board) index
    public static int getRow(int index) {
        return index / 8;
    }

    // get (board) index equivalent from a row & column combination
    public static int getIndex(int row, int column) {
        return row * 8 + column;
    }

    // return true if an index is blacklisted
    public static boolean indexIsBlacklisted(int index, int[] blacklist) {
        for (int list: blacklist) {
            if (index == list)
                return true;
        }
        return false;
    }

    // put queen in a random column that is empty and not blacklisted
    public static int getIndexInARandomColumn(int row, char[] board, int[] blacklist) {
        int col;
        int targetIndex;
        boolean cellIsNotAvailable;

        do {
            col = (int) (Math.random() * 8);
            targetIndex = getIndex(row, col);

            cellIsNotAvailable = (
                    // '-' is the default cell value
                    // denote an empty cell
                    board[targetIndex] != '-' ||
                            indexIsBlacklisted(targetIndex, blacklist)
            );

        } while (cellIsNotAvailable);

        return targetIndex;
    }

    public static void disableAttackingCell(int queenIndex, char[] board) {
        int queenRow = getRow(queenIndex);
        int queenCol = getColumn(queenIndex);
        int disabledIndex;

        // disable cells below the queen
        for (int i = 1; i < 8 - queenRow; i++) {
            disabledIndex = (i * 8) + queenIndex;
            board[disabledIndex] = '*';
        }

        // disable cells in queen's right diagonal
        int diagonalRightSentinel = Math.min(8 - queenCol, 8 - queenRow);
        for (int i = 1; i < diagonalRightSentinel; i++) {
            disabledIndex = (i * 9) + queenIndex;
            board[disabledIndex] = '*';
        }

        // disable cells in queen's left diagonal
        int diagonalLeftSentinel = Math.min(queenCol + 1, 8 - queenRow);
        for (int i = 1; i < diagonalLeftSentinel; i++) {
            disabledIndex = (i * 7) + queenIndex;
            board[disabledIndex] = '*';
        }

    }

    // Save a blacklisted (board) index to blacklist[] array
    public static void pushToBlacklist(int index, int[] blacklist) {

        boolean shouldFlushBlacklist = (index / 8) < blacklist[0] / 8;
        boolean blacklistIsFull = blacklist[blacklist.length - 1] != -1;

        if (blacklistIsFull) {
            System.out.println("Blacklist is full");
            System.exit(1);
        }

        if (shouldFlushBlacklist) {
            initializeWithMin1AsDefaultVal(blacklist);
        }

        for(int i =0;i<blacklist.length;i++) {
            if (blacklist[i] == -1) {
                blacklist[i] = index;
                break;
            }
        }
    }

    // display the content of blacklist array
    public static void displayBlacklistedCell(int[] blacklist) {
        System.out.print("Blacklisted cell: ");
        for (int list : blacklist) {
            // don't show the default value
            if (list == -1)
                break;
            System.out.printf("[%d,%d] ", getRow(list), getColumn(list));
        }
        System.out.println();
    }

    public static void displayBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

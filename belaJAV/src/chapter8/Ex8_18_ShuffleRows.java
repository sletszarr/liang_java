package chapter8;

/**
 * Created by Acer-756 on 7/16/2016.
 */

public class Ex8_18_ShuffleRows {

    public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        System.out.println("Before shuffling");
        displayArray(m);

        System.out.println("\nAfter shuffling");
        shuffle(m);
        displayArray(m);
    }

    public static void displayArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("%2d ", array[row][col]);
            }
            System.out.print("|");
        }
    }

    public static void shuffle(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            int rand = (int) (Math.random() * array.length);

            // swap row
            for (int col = 0; col < array[row].length; col++) {
                int temp = array[row][col];
                array[row][col] = array[rand][col];
                array[rand][col] = temp;
            }
        }

    }

}

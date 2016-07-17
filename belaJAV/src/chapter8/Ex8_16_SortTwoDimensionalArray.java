package chapter8;

/**
 * Created by Acer-756 on 7/15/2016.
 */

public class Ex8_16_SortTwoDimensionalArray {

    public static void main(String[] args) {

        int[][] array = {
                {4, 2, 3}, {1, 7, 1}, {1, 7, 3}, {1, 8, 2},
                {4, 5, 4}, {1, 2, 1}, {1, 1, 1}, {4, 1, 1},
                {4, 5, 1}, {1, 2, 0}
        };

        System.out.println("Before sorting: ");
        displayArray(array);

        sort(array);

        System.out.println("\nAfter sorting: ");
        displayArray(array);

    }

    // selection sort on row and column
    public static void sort(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int k = i + 1; k < array.length; k++) {

                // replaceable with
                // for (int m =0; m < array[k].length; m++) {
                for (int m = 0; m < array[i].length; m++) {
                    if (array[k][m] < array[min][m]) {
                        min = k;
                        break;
                    }

                    if (array[k][m] > array[min][m])
                        break;

                    // if array[k][m] == array[min][m]
                    // it'll try the next column(m) in row(k)
                    // to be compared with
                    // the next column(m) in row(min)
                }

            }

            if (min != i) {
                int temp;
                for(int k = 0;k<array[i].length;k++) {
                    temp = array[i][k];
                    array[i][k] = array[min][k];
                    array[min][k] = temp;
                }
            }
        }

    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for(int k =0;k<array[i].length;k++) {
                System.out.print(array[i][k]+" ");
            }
            System.out.print("| ");
        }
    }
}

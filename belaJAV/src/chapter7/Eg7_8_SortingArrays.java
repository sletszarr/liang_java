package chapter7;

/**
 * Created by Acer-756 on 7/3/2016.
 */

public class Eg7_8_SortingArrays {

    public static void main(String[] args) {

        double[] list = {3, 20, 4, 7, 10, 9, 1, 8, 2};
        System.out.println("Before sortng: ");
        printArray(list);

        selectionSort(list);

        System.out.println("After sorting: ");
        printArray(list);


    }

    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length; i++) {
            int minIndex = i;

            for (int k = i + 1; k < list.length; k++) {
                if (list[k] < list[minIndex]) {
                    minIndex = k;
                }
            }

            if (minIndex != i) {
                double temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

    public static void printArray(double[] array) {

        for (int i =0;i<array.length;i++) {
            System.out.printf("%3d", array[i]);
        }
        System.out.println();
    }
}

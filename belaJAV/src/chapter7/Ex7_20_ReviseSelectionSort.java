package chapter7;

/**
 * Created by Acer-756 on 7/5/2016.
 */

public class Ex7_20_ReviseSelectionSort {

    public static void main(String[] args) {

        double[] list = {3, 20, 4, 7, 10, 9, 1, 8, 2};
        System.out.println("Before sortng: ");
        printArray(list);

        selectionSort(list);

        System.out.println("After sorting: ");
        printArray(list);

    }

    public static void selectionSort(double[] numbers) {

        int maxIndex;
        double temp;

        for (int i = numbers.length - 1; i >= 0; i--) {

            maxIndex = i;

            for (int k = i - 1; k >= 0; k--) {
                if (numbers[k] > numbers[maxIndex]) {
                    maxIndex = k;
                }
            }

            if (maxIndex != i) {
                temp = numbers[i];
                numbers[i] = numbers[maxIndex];
                numbers[maxIndex] = temp;
            }
        }

    }

    public static void printArray(double[] numbers) {

        for (double number : numbers) {
            System.out.print(number+" ");
        }
        System.out.println();

    }


}

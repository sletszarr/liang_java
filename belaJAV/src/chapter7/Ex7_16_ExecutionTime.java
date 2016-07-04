package chapter7;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_16_ExecutionTime {

    public static void main(String[] args) {

        int[] numbers = generateRandomNums();
        long startTimeLinearSearch = System.currentTimeMillis();
        linearSearch(numbers, 99);
        long endTimeLinearSearch = System.currentTimeMillis();

        long startTimeSelectionSort = System.currentTimeMillis();
        sort(numbers);
        long endTimeSelectionSort = System.currentTimeMillis();
        long starTimeBinarySearch = System.currentTimeMillis();
        binarySearch(numbers, 99);
        long endTimeBinarySearch = System.currentTimeMillis();

        long linearSearchET = endTimeLinearSearch - startTimeLinearSearch;
        long selectionSortET = endTimeSelectionSort - startTimeSelectionSort;
        long binarySearchET = endTimeBinarySearch - starTimeBinarySearch;

        System.out.println("Linear search execution time:\n" +
                endTimeLinearSearch + " - " +
                startTimeLinearSearch + " = " +
                linearSearchET);

        System.out.println("Selection sort execution time:\n" +
                endTimeSelectionSort + " - " +
                startTimeSelectionSort + " = " +
                selectionSortET);

        System.out.println("Binary search execution time:\n" +
                endTimeBinarySearch + " - " +
                starTimeBinarySearch + " = " +
                binarySearchET);

    }

    public static int[] generateRandomNums(){
        int[] randomNumbers = new int[100000];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10000);
        }

        return randomNumbers;
    }

    public static int linearSearch(int[] numbers, int key) {
        for (int number : numbers) {
            if (number == key) {
                return number;
            }
        }

        return -1;
    }

    public static void sort(int[] numbers) {

        int smallestNumIndex;
        int temp;

        for (int i = 0; i < numbers.length; i++) {
            smallestNumIndex = i;

            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[k] < numbers[smallestNumIndex]) {
                    smallestNumIndex = k;
                }
            }

            if (smallestNumIndex != i) {
                temp = numbers[i];
                numbers[i] = numbers[smallestNumIndex];
                numbers[smallestNumIndex] = temp;
            }
        }
    }

    public static int binarySearch(int[] numbers, int key) {
        int lo = 0;
        int hi = numbers.length - 1;
        int mid;

        while (hi >= lo) {
            mid = (hi + lo) / 2;
            if (key == numbers[mid]) {
                return key;
            }
            else if (key < numbers[mid]) {
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }

        return -1;
    }

    public static void printNums(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%3d", numbers[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}

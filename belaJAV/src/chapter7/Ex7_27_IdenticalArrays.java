package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_27_IdenticalArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the first list
        System.out.print("Enter list1: ");
        int[] firstList = new int[input.nextInt()];
        for (int i = 0; i < firstList.length; i++) {
            firstList[i] = input.nextInt();
        }

        // get the second list
        System.out.print("Enter list2: ");
        int[] secondList = new int[input.nextInt()];
        for (int i = 0; i < secondList.length; i++) {
            secondList[i] = input.nextInt();
        }

        // check whether the 2 lists are identical
        System.out.println("The two list are" +
                ((isIdentical(firstList, secondList)) ? " " : " not ") +
                "identical");

    }

    public static boolean isIdentical(int[] firstList, int[] secondList) {

        if (firstList.length != secondList.length)
            return false;

        // make a copy
        int[] firstListCopy = new int[firstList.length];
        System.arraycopy(firstList, 0, firstListCopy, 0, firstList.length);

        int[] secondListCopy = new int[secondList.length];
        System.arraycopy(secondList, 0, secondListCopy, 0, secondList.length);

        // sort the 2 lists
        sort(firstListCopy);
        sort(secondListCopy);

        // check if the two are identical
        for (int i = 0; i < firstListCopy.length; i++) {
            if (firstListCopy[i] != secondListCopy[i])
                return false;
        }

        return true;

    }

    // do selection sort
    public static void sort(int[] numbers) {
        int minIndex;
        int temp;

        for (int i = 0; i < numbers.length; i++) {
            minIndex = i;

            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[k] < numbers[minIndex])
                    minIndex = k;
            }

            if (minIndex != i) {
                temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }
    }
}

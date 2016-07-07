package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_26_StrictlyIdenticalArray {

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

        // check whether the 2 list are strictly identical
        if (isStrictlyIdentical(firstList, secondList)) {
            System.out.println("The two list are strictly identical");
        } else {
            System.out.println("The two list are not strictly identical ");
        }

    }

    public static boolean isStrictlyIdentical(int[] firstList, int[] secondList) {

        if (firstList.length != secondList.length)
            return false;

        for(int i =0;i<firstList.length;i++) {
            if (firstList[i] != secondList[i])
                return false;
        }

        return true;
    }

}

package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_31_MergeTwoSortedList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first list: ");
        int[] firstList = new int[input.nextInt()];
        for (int i = 0; i < firstList.length; i++) {
            firstList[i] = input.nextInt();
        }

        System.out.print("Enter the second list: ");
        int[] secondList = new int[input.nextInt()];
        for (int i = 0; i < secondList.length; i++) {
            secondList[i] = input.nextInt();
        }

        int[] mergedList = merged(firstList, secondList);

        System.out.print("The merged list is ");
        for (int num: mergedList) {
            System.out.printf("%d ", num);
        }

    }

    public static int[] merged(int[] list1, int[] list2) {

        int[] mergedList = new int[list1.length + list2.length];
        int currentList1Index = 0; // is used to traverse list1[]
        int currentList2Index = 0; // is used to traverse list2[]

        for (int i = 0; i < mergedList.length; i++) {
            // if list1.length < list2.length,
            // when list1 is finished,
            // assigned the rest of list2 to mergedList[i]
            if (currentList1Index == list1.length) {
                mergedList[i] = list2[currentList2Index++];
                continue;
            }

            // if list2.length < list1.length
            // when list2 is finished,
            // assigned the rest of list1 to mergedList[i]
            if (currentList2Index == list2.length) {
                mergedList[i] = list1[currentList1Index++];
                continue;
            }

            // else, compare list1 and list2
            // the smallest value in its current index
            // will be assigned to mergedList[i].

            // if the value of list1 and list2
            // in its respective current index is the same,
            // then it doesn't matter which one is first assigned to mergedList[i]

            if (list1[currentList1Index] == list2[currentList2Index]) {
                mergedList[i] = list1[currentList1Index++];
                // mergedList[i] = list2[currentList2Index++]
                // will yield the same result
            }
            else if (list1[currentList1Index] < list2[currentList2Index]) {
                mergedList[i] = list1[currentList1Index++];
            }
            else {
                mergedList[i] = list2[currentList2Index++];
            }

        }

        return mergedList;

    }
}

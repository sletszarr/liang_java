package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_32_PartitionOfAList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int list[] = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        // partition the list
        System.out.println("The pivot index is " + partition(list));

        // display result
        System.out.print("After the partition, the list is ");
        for (int num : list) {
            System.out.print(num+" ");
        }

    }

    public static int partition(int[] list) {

        int pivot = list[0];
        int ltpi = 0;                    // less than pivot index
        int gtpi = list.length - 1;      // greater than pivot index
        int[] pivotedList = new int[list.length];

        for (int i = 1; i < list.length; i++) {
            if (list[i] <= pivot) {
                pivotedList[ltpi++] = list[i];
            } else if(list[i] > pivot){
                pivotedList[gtpi--] = list[i];
            }
        }
        pivotedList[ltpi] = pivot;

        System.arraycopy(pivotedList, 0, list, 0, list.length);

        return ltpi;
    }

}

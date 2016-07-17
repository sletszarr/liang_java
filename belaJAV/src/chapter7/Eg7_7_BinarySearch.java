package chapter7;

/**
 * Created by Acer-756 on 7/3/2016.
 */

public class Eg7_7_BinarySearch {

    public static void main(String[] args) {

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int key = 66;

        System.out.println(binarySearch(list, key));

    }

    public static int binarySearch(int[] list, int key) {

        int low = 0;
        int high = list.length - 1;
        int mid;

        while (high >= low) {
            mid = (high + low) / 2;

            if (key > list[mid]) {
                low = mid + 1;
            }
            else if (key == list[mid]) {
                return mid;
            }
            else {
                high = mid -1;
            }
        }

        return -low - 1;
    }

}

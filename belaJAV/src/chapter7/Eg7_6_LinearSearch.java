package chapter7;

/**
 * Created by Acer-756 on 7/3/2016.
 */

public class Eg7_6_LinearSearch {

    public static void main(String[] args) {

        // initialize list and key
        int[] list = {1, 2, 3, 4, 3, 1, 4, 2, 1, 3};
        int key = 4;

        // find key in list
        int indexFound = linearSearch(list, key);

        // display result
        if (indexFound == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println(key + " is on the index " + indexFound);
        }

    }

    public static int linearSearch(int[] list, int key) {

        // find key in list
        for (int i =0;i<list.length;i++) {
            if (list[i] == key) {
                return i;
            }
        }

        return -1;

    }

}

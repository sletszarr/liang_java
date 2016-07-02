package chapter7;

/**
 * Created by Acer-756 on 7/3/2016.
 */

public class Eg7_3_TestPassArray {

    public static void main(String[] args) {

        // initialize array
        int[] a = {1, 2};

        System.out.println("Before invoking swap");
        System.out.printf("array is {%d, %d}\n", a[0], a[1]);
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.printf("array is {%d, %d}\n", a[0], a[1]);

        System.out.println("Before invoking swap");
        System.out.printf("array is {%d, %d}\n", a[0], a[1]);
        swap(a);
        System.out.println("After invoking swap");
        System.out.printf("array is {%d, %d}\n", a[0], a[1]);
    }

    public static void swap(int n1, int n2) {

        int temp = n1;
        n1 = n2;
        n2 = temp;

    }

    public static void swap(int[] a) {

        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }


}

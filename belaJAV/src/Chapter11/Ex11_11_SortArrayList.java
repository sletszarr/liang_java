package Chapter11;

import java.util.ArrayList;

/**
 * Created by bnamora on 10/19/16.
 */

public class Ex11_11_SortArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        // populata array list
        for (int i = 0; i < 10; i++) {
            int randNum = (int) (Math.random() * 100);
            nums.add(randNum);
        }

        System.out.println(nums.toString());

        // sort array list
        sort(nums);

        System.out.println(nums.toString());

    }

    public static void sort(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {

            // set initial index for the smallest integer
            int minIndex = i;

            // find index of the smallest integer
            for (int k = i + 1; k < nums.size(); k++) {
                if (nums.get(k) < nums.get(minIndex)) {
                    minIndex = k;
                }
            }

            // swap i with minIndex
            int temp = nums.get(i);
            nums.set(i, nums.get(minIndex));
            nums.set(minIndex, temp);
        }

    }
}

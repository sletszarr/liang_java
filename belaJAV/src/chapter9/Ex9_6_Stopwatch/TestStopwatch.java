package chapter9.Ex9_6_Stopwatch;

/**
 * Created by bnamora on 7/21/16.
 */

public class TestStopwatch {

    public static void main(String[] args) {

        // create random number
        int[] nums = getRandomNumbers(100000);

        // create timer
        Stopwatch timer = new Stopwatch();

        // sort number
        timer.start();
        sortNumbers(nums);
        timer.stop();

        // display elapsed time
        System.out.println(timer.getElapsedTime());
    }

    public static int[] getRandomNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10000);
        }
        return numbers;
    }

    public static void sortNumbers(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;

            for (int k = i + 1; k < nums.length; k++) {
                if (nums[k] < nums[minIndex])
                    minIndex = k;
            }

            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }

        }

    }

}

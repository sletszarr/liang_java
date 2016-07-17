package chapter6;

/**
 * Created by Acer-756 on 7/2/2016.
 */
public class Ex6_26_PalindromicPrime {

    public static void main(String[] args) {

        final int NUMS_PER_LINE = 10;

        int number = 2;
        int count = 0;

        while (count < 100) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.printf("%8d", number);
                count++;

                if (count % NUMS_PER_LINE == 0) {
                    System.out.println();
                }
            }

            number++;
        }

    }

    public static boolean isPrime(long num) {

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean isPalindrome(long num) {

        String numString = num + "";
        int leftBound = 0;
        int rightBound = numString.length() - 1;

        while (leftBound < rightBound) {
            if (numString.charAt(leftBound) != numString.charAt(rightBound)) {
                return false;
            }

            leftBound++;
            rightBound--;
        }

        return true;

    }

}

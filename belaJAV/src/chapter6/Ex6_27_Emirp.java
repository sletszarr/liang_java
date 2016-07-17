package chapter6;

/**
 * Created by Acer-756 on 7/2/2016.
 */
public class Ex6_27_Emirp {

    public static void main(String[] args) {

        final int NUMS_PER_LINE = 10;
        long number = 2;
        int count = 0;

        while (count < 100) {
            if (Ex6_26_PalindromicPrime.isPalindrome(number)) {
                number++;
                continue;
            }

            if (isPrime(number) && isPrime(getReversed(number))) {
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

        for(int i =2;i<=num/2;i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long getReversed(long num) {

        String numReversed = "";

        while (num > 0) {
            numReversed += num % 10;
            num /= 10;
        }

        return Long.parseLong(numReversed);

    }
}


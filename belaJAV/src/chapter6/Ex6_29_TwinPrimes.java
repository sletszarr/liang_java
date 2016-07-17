package chapter6;

/**
 * Created by Acer-756 on 7/2/2016.
 */
public class Ex6_29_TwinPrimes {

    public static void main(String[] args) {

        for(int i =0;i<1000;i++) {
            if (Ex6_26_PalindromicPrime.isPrime(i) &&
                    Ex6_26_PalindromicPrime.isPrime(i + 2)) {
                System.out.printf("(%3d, %3d)\n", i, i + 2);
            }
        }
    }
}

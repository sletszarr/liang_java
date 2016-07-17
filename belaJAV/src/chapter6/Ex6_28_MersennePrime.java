package chapter6;

/**
 * Created by Acer-756 on 7/2/2016.
 */
public class Ex6_28_MersennePrime {

    public static void main(String[] args) {

        System.out.println(" p\t\t\t2^p-1");
        System.out.println("=========================");
        for (int i=2;i<=31;i++) {
            if (Ex6_26_PalindromicPrime.isPrime(i) &&
                    Ex6_26_PalindromicPrime.isPrime(getMersenneNum(i))) {
                System.out.printf("%2d\t\t\t%d\n", i, getMersenneNum(i));
            }
        }
    }

    public static long getMersenneNum(int p) {
        return (long) Math.pow(2, p) - 1;
    }
}

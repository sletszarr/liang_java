package mylib;

/**
 * Created by bnamora on 7/24/16.
 */

public class MyInteger {

    private int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isEven(MyInteger num) {
        return isEven(num.getValue());
    }

    public boolean isEven() {
        return isEven(value);
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isOdd(MyInteger num) {
        return isOdd(num.getValue());
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
            return false;
        }
        return true;
    }

    public static boolean isPrime(MyInteger num) {
        return isPrime(num.getValue());
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean equals(int otherValue) {
        return value == otherValue;
    }

    public boolean equals(MyInteger otherValue) {
        return value == otherValue.getValue();
    }

    public static int parseInt(char[] ch) {
        int intValue = 0;
        int base = 1;

        for (int i = ch.length - 1; i >= 0; i--) {
            if (Character.isDigit(ch[i])) {
                intValue += (ch[i] - 48) * base;
                base *= 10;
            }
        }
        return intValue;
    }

    public static int parseInt(String s) {
        return parseInt(s.toCharArray());
    }

}

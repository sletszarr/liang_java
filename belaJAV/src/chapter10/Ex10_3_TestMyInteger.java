package chapter10;

import mylib.MyInteger;

/**
 * Created by bnamora on 7/24/16.
 */
public class Ex10_3_TestMyInteger {

    public static void main(String[] args) {

        // create 3 MyInteger object
        MyInteger a = new MyInteger(90);
        MyInteger b = new MyInteger(99);
        MyInteger c = new MyInteger(103);

        // testing instance method is*
        System.out.printf("%d is even? %b\n",
                a.getValue(), a.isEven());
        System.out.printf("%d is odd? %b\n",
                b.getValue(), b.isOdd());
        System.out.printf("%d is prime? %b\n\n",
                c.getValue(), c.isPrime());

        // testing instance method equals
        System.out.printf("%d equals %d? %b\n",
                a.getValue(), 90, a.equals(90));
        System.out.printf("%d equals %d? %b\n\n",
                a.getValue(), b.getValue(),
                a.equals(b));

        // testing static method is*: MyInteger
        System.out.printf("%d is even? %b\n",
                a.getValue(), MyInteger.isEven(a));
        System.out.printf("%d is odd? %b\n",
                b.getValue(), MyInteger.isOdd(b));
        System.out.printf("%d is prime? %b\n\n",
                c.getValue(), MyInteger.isPrime(c));

        // testing static method is*: int
        System.out.printf("%d is even? %b\n",
                35, MyInteger.isEven(35));
        System.out.printf("%d is odd? %b\n",
                22, MyInteger.isOdd(22));
        System.out.printf("%d is prime? %b\n",
                151, MyInteger.isPrime(151));

        // testing static method parseInt: char[]
        char[] p = {'2', 'c', '8', '2', '4', 'w', 'p', '7', '2', 'x'};
        int q = MyInteger.parseInt(p);
        System.out.println("\n" + q);
        int r = q + 22;
        System.out.println(r);

        // testing static method parseInt: String
        int k = MyInteger.parseInt("j8492hwf829hg");
        System.out.println("\n" + k);
        int l = k * 100;
        System.out.println(l);

    }
}

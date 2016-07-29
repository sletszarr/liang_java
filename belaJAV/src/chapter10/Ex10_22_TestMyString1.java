package chapter10;

import mylib.MyString1;

/**
 * Created by bnamora on 7/29/16.
 */

public class Ex10_22_TestMyString1 {

    public static void main(String[] args) {

        MyString1 ms1 = new MyString1(
                new char[]{'B', 'u', 'r', 'g', 'e', 'r'});

        // test get length
        System.out.println(ms1.length());

        // test get char at
        System.out.println(ms1.charAt(2));

        // test substring
        ms1.substring(1, 4).print();

        // test to lower case
        ms1.toLowerCase().print();

        // test equals
        MyString1 ms2 = new MyString1(
                new char[]{'b', 'u', 'r', 'g', 'e', 'r'});
        System.out.println(ms1.equals(ms2));

        // test value of int
        MyString1.valueOf(283928329).print();

    }
}

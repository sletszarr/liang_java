package chapter10;

import mylib.MyStringBuilder2;

/**
 * Created by bnamora on 7/30/16.
 */

public class Ex10_28_TestMyStringBuilder2 {

    public static void main(String[] args) {

        char[] ch = {'A', ' ', 'd', 'a', 'y'};

        // construct MyStringBuilder2 from char[]
        MyStringBuilder2 msb1 = new MyStringBuilder2(ch);

        // construct MyStringBuilder2 from a string
        MyStringBuilder2 msb2 = new MyStringBuilder2("nother");

        // test insert(offset, msb)
        System.out.println(msb1.insert(1, msb2).toString());;

        // test reverse()
        System.out.println(msb1.reverse().toString());

        // test substring()
        System.out.println(msb1.substring(2));

        // test toUpperCase()
        msb2.toUpperCase();
        System.out.println(msb2.toString());

    }
}

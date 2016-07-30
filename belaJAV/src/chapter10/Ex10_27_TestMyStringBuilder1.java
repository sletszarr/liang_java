package chapter10;

import mylib.MyStringBuilder1;

/**
 * Created by bnamora on 7/30/16.
 */

public class Ex10_27_TestMyStringBuilder1 {

    public static void main(String[] args) {

        MyStringBuilder1 msb = new MyStringBuilder1("Teh Hijau");

        // test append(MySringBuilder1 sb)
        msb.append(new MyStringBuilder1("Kepala Jenggot"));
        System.out.println(msb.toString());

        // test append(int i)
        msb.append(88);
        System.out.println(msb.toString());

        // test length
        System.out.println(msb.length());

        // test charAt(int index)
        System.out.println(msb.charAt(100));

        // test toLowerCase()
        System.out.println(msb.toLowerCase().toString());

        // test substring()
        System.out.println(msb.substring(1, 5).toString());
    }
}

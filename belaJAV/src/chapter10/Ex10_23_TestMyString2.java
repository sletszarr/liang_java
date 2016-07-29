package chapter10;

import mylib.MyString2;

/**
 * Created by bnamora on 7/29/16.
 */

public class Ex10_23_TestMyString2 {

    public static void main(String[] args) {

        MyString2 mastr = new MyString2("Pokemon");

        // test compare: int method
        System.out.println(mastr.compare("Pokemin"));

        // test substring method
        mastr.substring(2).print();

        // test toUpperCase method
        mastr.toUpperCase().print();

        // test toChars method
        char[] ch = mastr.toChars();
        for (char c : ch)
            System.out.println(c);

        // test valueOf method
        MyString2.valueOf(true).print();

    }
}

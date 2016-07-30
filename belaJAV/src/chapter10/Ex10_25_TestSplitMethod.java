package chapter10;

import mylib.MyString1;

/**
 * Created by bnamora on 7/30/16.
 */
public class Ex10_25_TestSplitMethod {

    public static void main(String[] args) {

        String[] str =
                MyString1.split(
                        "ab?12?453",
                        "?");
        for (String s : str)
            System.out.println(s);

        str =
                MyString1.split(
                        "#a?b?adfs?df?32?gf#e",
                        "[?#]");
        for (String s : str)
            System.out.println(s);

    }
}

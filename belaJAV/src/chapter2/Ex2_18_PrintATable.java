package chapter2;

/**
 * Created by bnamora on 6/14/16.
 *
 *
 * (Print a table)
 * Write a program that displays the following table.
 * Cast floating- point numbers into integers.
 *
 * a        b       pow(a, b)
 * 1        2       1
 * 2        3       8
 * 3        4       81
 * 4        5       1024
 * 5        6       15625
 *
 */

public class Ex2_18_PrintATable {

    public static void main(String[] args) {

        int aVal = 1;
        int bVal = 2;

        System.out.println("a       b       pow(a,b)");
        System.out.println(aVal+ "       " + bVal+ "       " + (int) Math.pow(aVal++, bVal++));
        System.out.println(aVal+ "       " + bVal+ "       " + (int) Math.pow(aVal++, bVal++));
        System.out.println(aVal+ "       " + bVal+ "       " + (int) Math.pow(aVal++, bVal++));
        System.out.println(aVal+ "       " + bVal+ "       " + (int) Math.pow(aVal++, bVal++));
        System.out.println(aVal+ "       " + bVal+ "       " + (int) Math.pow(aVal++, bVal++));

    }
}

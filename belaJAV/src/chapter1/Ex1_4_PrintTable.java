package chapter1;

/**
 * Created by bnamora on 6/7/16.
 *
 * (Print a table)
 * Write a program that displays the following table:
 * a    a^2     a^3
 * 1    1       1
 * 2    4       8
 * 3    9       27
 * 4    16      64
 */

public class Ex1_4_PrintTable {
    public static void main(String[] args) {
        System.out.println("a       a^2     a^3");
        System.out.println("1       "+(1*1)+"       "+(1*1*1));
        System.out.println("2       "+(2*2)+"       "+(2*2*2));
        System.out.println("3       "+(3*3)+"       "+(3*3*3));
        System.out.println("4       "+(4*4)+"      "+(4*4*4));
    }
}

package chapter2;

/**
 * Created by bnamora on 6/14/16.
 */

public class Ex218_PrintATable {

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

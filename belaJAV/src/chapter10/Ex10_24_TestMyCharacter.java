package chapter10;

import mylib.MyCharacter;

/**
 * Created by bnamora on 7/29/16.
 */

public class Ex10_24_TestMyCharacter {

    public static void main(String[] args) {

        // test isDigit
        System.out.println(MyCharacter.isDigit('2'));

        // test isLetter
        System.out.println(MyCharacter.isLetter('a'));

        // test isLetterOrDigit
        System.out.println(MyCharacter.isLetterOrDigit('-'));

        // test isLowerCase
        System.out.println(MyCharacter.isLowerCase('A'));

        // test isUpperCase
        System.out.println(MyCharacter.isUpperCase('Z'));

        // test toLowerCase
        System.out.println(MyCharacter.toLowerCase('A'));

        // test toUpperCase
        System.out.println(MyCharacter.toUpperCase('a'));

    }

}

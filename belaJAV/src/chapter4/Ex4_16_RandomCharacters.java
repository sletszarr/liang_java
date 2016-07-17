package chapter4;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_16_RandomCharacters {

    public static void main(String[] args) {

        int upperCaseASCII = (int) (65 + Math.random() * 26);
        System.out.println((char) upperCaseASCII);

    }
}

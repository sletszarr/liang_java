package chapter10;

import mylib.StackOfIntegers;

/**
 * Created by bnamora on 7/23/16.
 */
public class Eg10_7_8_TestStackOfIntegers {

    public static void main(String[] args) {

        // create stack object
        StackOfIntegers stack = new StackOfIntegers();

        // push 10 randoms
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 100);
            stack.push(rand);
        }

        // pop all
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}

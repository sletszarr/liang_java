package Chapter11;

import mylib.MyStack;
import java.util.Scanner;

/**
 * Created by bnamora on 10/19/16.
 */

public class Ex11_10_TestingMyStack {

    public static void main(String[] args) {

        MyStack stringStack = new MyStack();
        Scanner input = new Scanner(System.in);

        // Get 5 string
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter any string: ");
            String str = input.next();
            stringStack.push(str);
        }

        // Display in reverse order
        int stringSize = stringStack.size();
        for (int i = 0; i < stringSize; i++) {
            System.out.println(stringStack.pop());
        }
    }
}

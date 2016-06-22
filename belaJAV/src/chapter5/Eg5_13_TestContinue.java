package chapter5;


/**
 * Created by bnamora on 6/22/16.
 */

public class Eg5_13_TestContinue {

    public static void main(String[] args) {

        int sum = 0;
        int num = 0;

        while (num< 20) {
            num++;

            if (num == 10 || num == 11) {
                continue;
            }

            System.out.println(num);

            sum += num;
        }

        System.out.println("The sum is " + sum);

    }
}

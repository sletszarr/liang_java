package chapter9;

import java.util.Date;

/**
 * Created by bnamora on 7/21/16.
 */

public class Ex9_3_UsingDateClass {

    public static void main(String[] args) {

        // create date object
        Date date = new Date();

        // create initial elapsed time
        long elapsedTime = 10000;

        // set date and display time
        for (int i = 0; i < 8; i++) {
            date.setTime(elapsedTime);
            System.out.println(date.toString());
            elapsedTime *= 10;
        }

    }
}

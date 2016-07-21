package chapter9;

import java.util.GregorianCalendar;

/**
 * Created by bnamora on 7/21/16.
 */

public class Ex9_5_UsingGregorianCalendar {

    public static void main(String[] args) {

        // create gregorian calendar's object
        GregorianCalendar date = new GregorianCalendar();

        // display current date time
        System.out.print(date.get(GregorianCalendar.YEAR) + "/");
        System.out.print(date.get(GregorianCalendar.MONTH) + "/");
        System.out.print(date.get(GregorianCalendar.DAY_OF_MONTH));

        // change time
        long elapsedTime = 1234567898765L;
        date.setTimeInMillis(elapsedTime);

        // redisplay
        System.out.println();
        System.out.print(date.get(GregorianCalendar.YEAR) + "/");
        System.out.print(date.get(GregorianCalendar.MONTH) + "/");
        System.out.print(date.get(GregorianCalendar.DAY_OF_MONTH));
    }
}

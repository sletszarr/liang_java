package chapter10;

import mylib.MyDate;

/**
 * Created by bnamora on 7/28/16.
 */

public class Ex10_14_TestMyDate {

    public static void main(String[] args) {

        // construct date object
        MyDate date1 = new MyDate();
        System.out.printf("%d/%d/%d\n", date1.getYear(),
                date1.getMonth(), date1.getDay());

        // construct date object
        // with specified elapsed time
        MyDate date2 = new MyDate(561555550000L);
        System.out.printf("%d/%d/%d\n", date2.getYear(),
                date2.getMonth(), date2.getDay());

    }
}

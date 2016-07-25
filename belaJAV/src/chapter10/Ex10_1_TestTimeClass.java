package chapter10;

import mylib.Time;

/**
 * Created by bnamora on 7/24/16.
 */
public class Ex10_1_TestTimeClass {

    public static void main(String[] args) {

        // create and display
        // the first time object
        Time time = new Time();
        System.out.printf("%d:%d:%d\n",
                time.getHour(),
                time.getMinute(),
                time.getSecond());

        // create and display
        // the second time object
        Time time2 = new Time(555550000);
        System.out.printf("%d:%d:%d\n",
                time2.getHour(),
                time2.getMinute(),
                time2.getSecond());

    }
}

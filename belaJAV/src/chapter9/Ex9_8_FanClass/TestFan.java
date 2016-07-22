package chapter9.Ex9_8_FanClass;

/**
 * Created by bnamora on 7/22/16.
 */

public class TestFan {

    public static void main(String[] args) {

        // create the first fan
        Fan kipas1 = new Fan();
        kipas1.turnOn();
        kipas1.setSpeed(Fan.FAST);
        kipas1.setRadius(10);
        kipas1.setColor("Yellow");

        // create the second fan
        Fan kipas2 = new Fan();
        kipas2.setSpeed(Fan.MEDIUM);

        // display
        System.out.println(kipas1.toString());
        System.out.println(kipas2.toString());
    }
}

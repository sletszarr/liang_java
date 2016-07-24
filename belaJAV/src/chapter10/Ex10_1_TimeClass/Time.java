package chapter10.Ex10_1_TimeClass;

/**
 * Created by bnamora on 7/24/16.
 */

public class Time {

    private int hour;
    private int minute;
    private int second;

    Time() {
        this(System.currentTimeMillis());
    }

    Time(long elapsedTime) {
        second = (int) (elapsedTime / 1000) % 60;
        minute = (int) (elapsedTime / 1000 / 60) % 60;
        hour = (int) (elapsedTime / 1000 / 60 / 60) % 24;
    }

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        second = (int) (elapsedTime / 1000) % 60;
        minute = (int) (elapsedTime / 1000 / 60) % 60;
        hour = (int) (elapsedTime / 1000 / 60 / 60) % 60;
    }

}

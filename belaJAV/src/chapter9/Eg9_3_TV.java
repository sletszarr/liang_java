package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_3_TV {

    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public Eg9_3_TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120)
            this.channel = channel;
    }

    public void setVolume(int volumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= 7)
            this.volumeLevel = volumeLevel;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        volumeLevel--;
    }

}

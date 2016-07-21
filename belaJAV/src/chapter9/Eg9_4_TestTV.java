package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */
public class Eg9_4_TestTV {

    public static void main(String[] args) {

        Eg9_3_TV tv1 = new Eg9_3_TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        Eg9_3_TV tv2 = new Eg9_3_TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeDown();

        System.out.println("tv1's channel is " + tv1.channel +
                        " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel +
                        " and volume level is " + tv2.volumeLevel);

    }

}

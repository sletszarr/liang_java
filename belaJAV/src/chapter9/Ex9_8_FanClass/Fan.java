package chapter9.Ex9_8_FanClass;

/**
 * Created by bnamora on 7/22/16.
 */

public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {

        String description = "";

        if (on) {
            description += "Speed: " + speed + " | ";
            description += "Color: " + color + " | ";
            description += "Radius: " + radius;
        } else {
            description += "Color: " + color + " | ";
            description += "Radius: " + radius + " | ";
            description += "fan is off";
        }

        return description;
    }
}

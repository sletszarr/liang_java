package mylib;

/**
 * Created by bnamora on 7/22/16.
 */

public class Fan {

    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
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
        this.radius = (radius > 0) ? radius : 0;
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

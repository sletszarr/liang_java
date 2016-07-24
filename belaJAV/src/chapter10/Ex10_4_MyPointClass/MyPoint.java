package chapter10.Ex10_4_MyPointClass;

/**
 * Created by bnamora on 7/24/16.
 */

public class MyPoint {

    private double x;
    private double y;

    MyPoint() {
        this(0, 0);
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint b) {
        return distance(b.getX(), b.getY());
    }

    public double distance(double x1, double y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }

}

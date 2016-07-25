package mylib;

/**
 * Created by bnamora on 7/24/16.
 */

public class MyPoint {

    public double x;
    public double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double distance(MyPoint b) {
        return distance(b.x, b.y);
    }

    public double distance(double x1, double y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }

}

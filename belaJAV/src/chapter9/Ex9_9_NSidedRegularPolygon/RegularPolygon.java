package chapter9.Ex9_9_NSidedRegularPolygon;

/**
 * Created by bnamora on 7/22/16.
 */

public class RegularPolygon {

    private int nSide = 3;
    private double sideLength = 1;
    private double centerX = 0;
    private double centerY = 0;

    RegularPolygon() {
    }

    RegularPolygon(int nSide, double sideLength) {
        this.nSide = nSide;
        this.sideLength = sideLength;
    }

    RegularPolygon(int nSide, double sideLength,
            double centerX, double centerY) {
        this.nSide = nSide;
        this.sideLength = sideLength;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getnSide() {
        return nSide;
    }

    public void setnSide(int nSide) {
        this.nSide = nSide;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getPerimeter() {
        return sideLength * nSide;
    }

    public double getArea() {
        return (nSide * sideLength * sideLength) /
                (4 * Math.tan(Math.PI / nSide));
    }

}

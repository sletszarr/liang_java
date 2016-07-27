package mylib;

/**
 * Created by bnamora on 7/27/16.
 */

public class MyRectangle2D {

    private double cx;
    private double cy;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double cx, double cy, double width, double height) {
        this.cx = cx;
        this.cy = cy;
        this.width = width;
        this.height = height;
    }

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean contains(double x, double y) {
        return (cx - width / 2) <= x && x <= (cx + width / 2) &&
                (cy - height / 2) <= y && y <= (cy - height / 2);
    }

    public boolean contains(MyPoint p) {
        return contains(p.x, p.y);
    }

    public boolean contains(MyRectangle2D rect) {
        // calculate distance between centers
        double distanceBCX = Math.abs(this.cx - rect.cx);
        double distanceBCY = Math.abs(this.cy - rect.cy);

        return (distanceBCX + rect.width / 2) <= this.width / 2 &&
                (distanceBCY + rect.height / 2) <= this.height / 2;

    }

    public boolean overlaps(MyRectangle2D rect) {
        // calculate distance between centers
        double distanceBCX = Math.abs(this.cx - rect.cx);
        double distanceBCY = Math.abs(this.cy - rect.cy);

        return (distanceBCX + rect.width / 2) > this.width / 2 &&
                distanceBCX <= this.width / 2 + rect.width / 2 &&
                (distanceBCY + rect.height / 2) > this.height / 2 &&
                distanceBCY <= this.height / 2 + rect.height / 2;

    }


}

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

    public static MyRectangle2D getRectangle(double[][] points) {
        // get boundary
        double[][] boundary = getBoundaryFromPoints(points);

        // set boundary
        double xMin = boundary[0][0];
        double yMin = boundary[0][1];
        double xMax = boundary[1][0];
        double yMax = boundary[1][1];

        // prepare arguments for constructor
        double width = xMax - xMin;
        double height = yMax - yMin;
        double cx = xMin + width / 2;
        double cy = yMin + height / 2;

        return new MyRectangle2D(cx, cy, width, height);
    }

    private static double[][] getBoundaryFromPoints(double[][] points) {
        double[][] boundary = new double[2][2];

        // get all x's from points
        double[] xs = new double[points.length];
        for (int point = 0; point < points.length; point++) {
            xs[point] = points[point][0];
        }

        // get all y's from points
        double[] ys = new double[points.length];
        for (int point = 0; point < points.length; point++) {
            ys[point] = points[point][1];
        }

        // sort x's and y's
        sort(xs);
        sort(ys);

        // get boundary
        boundary[0][0] = xs[0];
        boundary[0][1] = ys[0];
        boundary[1][0] = xs[xs.length - 1];
        boundary[1][1] = ys[ys.length - 1];

        return boundary;
    }

    private static void sort(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;

            for (int k = i + 1; k < nums.length; k++) {
                if (nums[k] < nums[minIndex])
                    minIndex = k;
            }

            if (minIndex != i) {
                double temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }
}

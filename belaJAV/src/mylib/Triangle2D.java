package mylib;

/**
 * Created by bnamora on 7/25/16.
 */

public class Triangle2D {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;
    private Line2D edge1;
    private Line2D edge2;
    private Line2D edge3;

    public Triangle2D() {
        this(0, 0, 1, 1, 2, 5);
    }

    public Triangle2D(MyPoint p1,
                      MyPoint p2,
                      MyPoint p3) {

        this(p1.x, p1.y,
                p2.x, p2.y,
                p3.x, p3.y);
    }

    public Triangle2D(double x1, double y1,
                      double x2, double y2,
                      double x3, double y3) {

        p1 = new MyPoint(x1, y1);
        p2 = new MyPoint(x2, y2);
        p3 = new MyPoint(x3, y3);
        edge1 = new Line2D(x1, y1, x2, y2);
        edge2 = new Line2D(x2, y2, x3, y3);
        edge3 = new Line2D(x3, y3, x1, y1);
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double s = (edge1.length + edge2.length + edge3.length) / 2;
        double area = Math.sqrt(
                s * (s - edge1.length) * (s - edge2.length) * (s - edge3.length)
        );
        return area;
    }

    public double getPerimeter() {
        return edge1.length + edge2.length + edge3.length;
    }

    public boolean contains(double x, double y) {

        // if (x,y) is outside
        // the bounding rect of this triangle
        if (pointIsOutsideBoundingRect(x, y))
            return false;

        // if point is on the edges
        if (pointIsOnEdges(x, y))
            return true;

        return pointIsInside(x, y);

    }

    public boolean contains(Triangle2D t) {
        return contains(t.p1.x, t.p1.y) &&
                contains(t.p2.x, t.p2.y) &&
                contains(t.p3.x, t.p3.y);
    }

    public boolean overlaps(Triangle2D t) {
        return edge1.intersects(t.edge1) ||
                edge1.intersects(t.edge2) ||
                edge1.intersects(t.edge3) ||
                edge2.intersects(t.edge1) ||
                edge2.intersects(t.edge2) ||
                edge2.intersects(t.edge3) ||
                edge3.intersects(t.edge1) ||
                edge3.intersects(t.edge2) ||
                edge3.intersects(t.edge3);
    }

    private boolean pointIsOutsideBoundingRect(double x, double y) {
        // get the bounding rectangle
        double minX = Math.min(p1.x, Math.min(p2.x, p3.x));
        double minY = Math.min(p1.y, Math.min(p2.y, p3.y));
        double maxX = Math.max(p1.x, Math.max(p2.x, p3.x));
        double maxY = Math.max(p1.y, Math.max(p2.y, p3.y));

        // check if (x,y) is outside the bounding rectangle
        boolean xIsOutside = (x < minX || x > maxX);
        boolean yIsOutside = (y < minY || y > maxY);

        return xIsOutside || yIsOutside;

    }

    private boolean pointIsOnEdges(double x, double y) {
        return edge1.pointIsOnLineSegment(x, y) ||
                edge2.pointIsOnLineSegment(x, y) ||
                edge3.pointIsOnLineSegment(x, y);
    }

    // calculate whether (x,y) is inside this triangle
    // using barycentric coordinate system
    private boolean pointIsInside(double x, double y) {
        double denominator = (p2.y - p3.y) * (p1.x - p3.x) +
                        (p3.x - p2.x) * (p1.y - p3.y);

        double a = ((p2.y - p3.y) * (x - p3.x) + (p3.x - p2.x) * (y - p3.y))
                / denominator;
        double b = ((p3.y - p1.y) * (x - p3.x) + (p1.x - p3.x) * (y - p3.y))
                / denominator;
        double c = 1 - a - b;

        return 0 <= a && a <= 1 &&
                0 <= b && b <= 1 &&
                0 <= c && c <= 1;
    }

}

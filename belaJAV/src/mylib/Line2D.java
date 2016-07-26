package mylib;

/**
 * Created by bnamora on 7/25/16.
 */

public class Line2D {

    public MyPoint start;
    public MyPoint end;
    public double length;

    public Line2D() {
        this(0, 0, 1, 1);
    }

    public Line2D(MyPoint start, MyPoint end) {
        this(start.x, start.y, end.x, end.y);
    }

    public Line2D(Line2D line) {
        this(line.start.x, line.start.y,
                line.start.x, line.end.y);
    }

    public Line2D(double startX, double startY,
                  double endX, double endY) {

        // create new MyPoint object in memory
        // so it wouldn't be dependent
        // on outside objects
        // that's passed in
        // to the constructor argument
        start = new MyPoint(startX, startY);
        end = new MyPoint(endX, endY);
        length = start.distance(end);
    }

    public MyPoint getIntersectingPoint(double startX, double startY,
                                        double endX, double endY) {
        // get coefficient
        // for linear equation
        double a = start.y - end.y;
        double b = start.x - end.x;
        double c = startY - endY;
        double d = startX - endX;
        double e = a * start.x - b * start.y;
        double f = c * startX - d * startY;

        // create linear eqn object
        LinearEquation eqn = new LinearEquation(a, -b, c, -d, e, f);

        // return intersecting point
        // return null if the line is parallel
        if (eqn.isSolvable())
            return new MyPoint(eqn.getX(), eqn.getY());
        else
            return null;

    }

    public MyPoint getIntersectingPoint(MyPoint start, MyPoint end) {
        return getIntersectingPoint(start.x, start.y, end.x, end.y);
    }

    public MyPoint getIntersectingPoint(Line2D line) {
        return getIntersectingPoint(line.start, line.end);
    }

    public boolean pointIsOnLine(double x, double y) {
        final double EPSILON = 1E-12;

        // calculate determinant
        double determinant = (y - start.y) * (end.x - start.x)
                - (x - start.x) * (end.y - start.y);

        // for (x,y) to be on the line,
        // determinant should equals to 0
        // here, EPSILON is used to handle the case
        // when determinant is 0, but because of
        // floating point precision problem
        // it ended up being 0.000000000000000034343 for example
        return 0 <= determinant && determinant < EPSILON;
    }

    public boolean pointIsOnLine(MyPoint p) {
        return pointIsOnLine(p.x, p.y);
    }

    public boolean pointIsOnLineSegment(double x, double y) {
        // get min and max points,
        // to be used as boundary
        double minX = Math.min(start.x, end.x);
        double maxX = Math.max(start.x, end.x);
        double minY = Math.min(start.y, end.y);
        double maxY = Math.max(start.y, end.y);

        // check if the point is on the line
        boolean isOnLine = pointIsOnLine(x, y);

        return isOnLine &&
                (x >= minX && x <= maxX) &&
                (y >= minY && y <= maxY);
    }

    public boolean pointIsOnLineSegment(MyPoint p) {
        return pointIsOnLineSegment(p.x, p.y);
    }

    public boolean pointIsOnTheRightSide(double x, double y) {
        return (y - start.y) * (end.x - start.x)
                - (x - start.x) * (end.y - start.y) < 0;
    }

    public boolean pointIsOnTheRightSide(MyPoint p) {
        return pointIsOnTheRightSide(p.x, p.y);
    }

    public boolean pointIsOnTheLeftSide(double x, double y) {
        return (y - start.y) * (end.x - start.x)
                - (x - start.x) * (end.y - start.y) > 0;
    }

    public boolean pointIsOnTheLeftSide(MyPoint p) {
        return pointIsOnTheLeftSide(p.x, p.y);
    }

    public boolean intersects(Line2D l) {
        MyPoint intersectingPoint = getIntersectingPoint(l);
        if (intersectingPoint == null)
            return false;

        return this.pointIsOnLineSegment(intersectingPoint) &&
                l.pointIsOnLineSegment(intersectingPoint);
    }

}

package chapter9.Ex9_13_LocationClass;

/**
 * Created by bnamora on 7/22/16.
 */
public class Location {

    public int row;
    public int col;
    public double maxValue;

    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {

        double maxValue = a[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > maxValue) {
                    maxValue = a[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        return new Location(maxRow, maxCol, maxValue);
    }

}

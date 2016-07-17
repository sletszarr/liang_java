package chapter4;

/**
 * Created by bnamora on 6/19/16.
 */

public class Ex4_3_EstimateAreas {

    public static void main(String[] args) {

        double earthRadius = 6371.01;

        double atlantaLatitude = 51.5138505182;
        double x1 = Math.toRadians(atlantaLatitude);
        double atlantaLongitude = -0.15690922737098845;
        double y1 = Math.toRadians(atlantaLongitude);

        double orlandoLatitude = 28.5383355;
        double x2 = Math.toRadians(orlandoLatitude);
        double orlandoLongitude = -81.37923649999999;
        double y2 = Math.toRadians(orlandoLongitude);

        double savannahLatitude = 32.0835407;
        double x3 = Math.toRadians(savannahLatitude);
        double savannahLongitude = -81.09983419999998;
        double y3 = Math.toRadians(savannahLongitude);

        double charlotteLatitude = 35.2270869;
        double x4 = Math.toRadians(charlotteLatitude);
        double charlotteLongitude = -80.84312669999997;
        double y4 = Math.toRadians(charlotteLongitude);

        // Calculating edges between 4 points
        double side1 = earthRadius
                * Math.acos(Math.sin(x1) * Math.sin(x2) +
                            Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        double side2 = earthRadius
                * Math.acos(Math.sin(x2) * Math.sin(x3) +
                            Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));

        double diagonalSide = earthRadius
                * Math.acos(Math.sin(x1) * Math.sin(x3) +
                            Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));

        double side3 = earthRadius
                * Math.acos(Math.sin(x3) * Math.sin(x4) +
                            Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));

        double side4 = earthRadius
                * Math.acos(Math.sin(x4) * Math.sin(x1) +
                            Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1));

        // Calculating the first half (triangle) of area between 4 points
        double sFirstHalf = (side1 + side2 + diagonalSide) / 2;
        double areaFirstHalf = Math.pow(2 * sFirstHalf *
                (sFirstHalf - side1) * (sFirstHalf - side2) * (sFirstHalf - diagonalSide), 0.5);

        // Calculating the second half (triangle) of area between 4 points
        double sSecondHalf = (side3 + side4 + diagonalSide) / 2;
        double areaSecondHalf = Math.pow(2 * sSecondHalf *
                (sSecondHalf - side3) * (sSecondHalf - side4) * (sSecondHalf - diagonalSide), 0.5);

        // Calculating the estimated area between 4 points
        double estimatedArea = areaFirstHalf + areaSecondHalf;

        // Display the result
        System.out.println("The estimated area between\n" +
                "Atlanta, Georgia\nOrlando, Florida\nSavannah, Georgia\nand Charlotte, North Carolina\n" +
                "is " + estimatedArea + " km2");

    }
}

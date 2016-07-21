package chapter9.Ex9_2_StockClass;

/**
 * Created by bnamora on 7/21/16.
 */

public class TestStock {

    public static void main(String[] args) {

        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.previousClosingPrice = 34.5;
        oracle.currentPrice = 34.35;

        // display price change
        System.out.println("Summary");
        System.out.println(oracle.symbol + " - " + oracle.name);
        System.out.println("previous closing price: " + oracle.previousClosingPrice);
        System.out.println("current price: " + oracle.currentPrice);
        System.out.printf("price change: %.2f", oracle.getChangePercent());

    }
}

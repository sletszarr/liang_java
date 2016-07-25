package mylib;

/**
 * Created by bnamora on 7/24/16.
 */

public class Tax {

    public static int SINGLE_FILER = 0;
    public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    Tax() {
        filingStatus = 0;
        taxableIncome = 50000;
    }

    Tax(int filingStatus,
        int[][] brackets,
        double[] rates,
        double taxableIncome)
    {
        this.filingStatus = filingStatus;
        setBrackets(brackets);
        setRates(rates);
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {

        this.brackets = new int[brackets.length][brackets[0].length];

        for (int row = 0; row < brackets.length; row++)
            System.arraycopy(brackets[row], 0,
                    this.brackets[row], 0, brackets[row].length);
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        System.arraycopy(rates, 0, this.rates, 0, rates.length);
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;

        if (brackets == null || rates == null) {
            System.out.println("You haven't set the tax brackets/rates");
        } else {

            if (taxableIncome <= brackets[filingStatus][0]) {
                tax = taxableIncome * rates[0];
            }
            else if (taxableIncome <= brackets[filingStatus][1]) {
                tax = brackets[filingStatus][0] * rates[0] +
                        (taxableIncome - brackets[filingStatus][0]) * rates[1];
            }
            else if (taxableIncome <= brackets[filingStatus][2]) {
                tax = brackets[filingStatus][0] * rates[0] +
                        (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                        (taxableIncome - brackets[filingStatus][1]) * rates[2];
            }
            else if (taxableIncome <= brackets[filingStatus][3]) {
                tax = brackets[filingStatus][0] * rates[0] +
                        (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                        (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                        (taxableIncome - brackets[filingStatus][2]) * rates[3];

            }
            else if (taxableIncome <= brackets[filingStatus][4]) {
                tax = brackets[filingStatus][0] * rates[0] +
                        (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                        (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                        (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                        (taxableIncome - brackets[filingStatus][3]) * rates[4];

            }
            else {
                tax = brackets[filingStatus][0] * rates[0] +
                        (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                        (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                        (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                        (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4] +
                        (taxableIncome - brackets[filingStatus][4]) * rates[5];
            }
        }

        return tax;
    }
}

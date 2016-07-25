package mylib;

/**
 * Created by bnamora on 7/22/16.
 */

public class LinearEquation {

    private double a,b,c,d,e,f;

    public LinearEquation(double... eqn) {
        if (eqn.length == 6) {
            this.a = eqn[0];
            this.b = eqn[1];
            this.c = eqn[2];
            this.d = eqn[3];
            this.e = eqn[4];
            this.f = eqn[5];
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f)
                / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c)
                / (a * d - b * c);
    }

}

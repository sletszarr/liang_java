package chapter10;

/**
 * Created by bnamora on 7/22/16.
 */

public class Eg10_3_UseBMIClass {

    public static void main(String[] args) {

        Eg10_4_BMI bmi1 = new Eg10_4_BMI("Kim Yang", 18, 145, 70);
        System.out.printf("The BMI for %s is %.2f %s\n",
                bmi1.getName(), bmi1.getBMI(), bmi1.getStatus());

        Eg10_4_BMI bmi2 = new Eg10_4_BMI("Susan King", 215, 70);
        System.out.printf("The BMI for %s is %.2f %s\n",
                bmi2.getName(), bmi2.getBMI(), bmi2.getStatus());

    }
}

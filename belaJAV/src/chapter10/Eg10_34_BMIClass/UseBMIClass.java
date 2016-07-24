package chapter10.Eg10_34_BMIClass;

/**
 * Created by bnamora on 7/22/16.
 */

public class UseBMIClass {

    public static void main(String[] args) {

        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.printf("The BMI for %s is %.2f %s\n",
                bmi1.getName(), bmi1.getBMI(), bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.printf("The BMI for %s is %.2f %s\n",
                bmi2.getName(), bmi2.getBMI(), bmi2.getStatus());

    }
}

package chapter10.Ex10_2_BMIClass;

/**
 * Created by bnamora on 7/24/16.
 */

public class TestBMI {

    public static void main(String[] args) {

        // create bmi object
        BMI bmi = new BMI("John Doe", 30, 180, 5, 7);

        // display bmi
        System.out.printf("%s's bmi is %.2f\n",
                bmi.getName(), bmi.getBMI());
        System.out.printf("status: %s", bmi.getStatus());

    }
}

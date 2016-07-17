package chapter7;

/**
 * Created by Acer-756 on 7/3/2016.
 */
public class Eg7_9_Calculator {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: operand1 operator operand2");
            System.exit(1);
        }

        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '.':
                result = op1 * op2;
                break;
            case '/':
                result = op1 / op2;
        }

        // display result
        System.out.printf("%d + %d = %d\n", op1, op2, result);

    }
}

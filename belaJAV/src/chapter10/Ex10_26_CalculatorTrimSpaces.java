package chapter10;

/**
 * Created by bnamora on 7/30/16.
 */

public class Ex10_26_CalculatorTrimSpaces {

    public static void main(String[] args) {

        // get expressions
        String[] expression = getExpression(args);

        int op1 = Integer.parseInt(expression[0]);
        int op2 = Integer.parseInt(expression[2]);
        int result = 0;

        switch (expression[1].charAt(0)) {
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

    public static String[] getExpression(String[] str) {
        String[] expr = new String[3];
        int index = 0;

        for (String s : str) {

            // get digit and operator
            String digit = getDigit(s);
            String op = getOperator(s);

            // add digits to expr[]
            if (digit != null)
                expr[index++] = digit;

            // add operator to expr[]
            if (op != null)
                expr[index++] = op;

            if (index == 3) break;
        }
        return expr;
    }

    public static String getDigit(String s) {
        String digit = "";

        for (int i = 0; i < s.length(); i++) {
            if (isDigit(s.charAt(i)))
                digit += s.charAt(i);
            else break;
        }

        return (digit.length() > 0) ? digit : null;
    }

    public static String getOperator(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (isOperator(s.charAt(i))) {
                return s.charAt(i) + "";
            }
        }

        return null;
    }

    public static boolean isDigit(char ch) {
        return '0' <= ch && ch <= '9';
    }

    public static boolean isOperator(char s) {
        return s == '+' ||
                s == '-' ||
                s == '.' ||
                s == '/';
    }
}

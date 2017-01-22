package Chapter12;

/**
 * Created by bnamora on 1/22/17.
 */

public class Eg12_6_TestException {

    public static void main(String[] args) {

        try {
            System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.printf("\n\nTrace info obtained from getStackTrace()");
            StackTraceElement[] traceElements = ex.getStackTrace();

            for (int i = 0; i < traceElements.length; i++) {
                System.out.println("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ": ");
                System.out.print(traceElements[i].getLineNumber() + ")");
            }
        }

    }

    private static int sum(int[] list) {

        int result = 0;

        for (int i = 0; i <= list.length; i++) {
            result += list[i];
        }

        return result;
    }

    
}

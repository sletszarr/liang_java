package Chapter12;

/**
 * Created by bnamora on 1/22/17.
 */

public class Eg12_9_ChainedExceptionDemo {

    public static void main(String[] args) {

        try {
            method1();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static void method1() throws Exception{

        try{
            method2();
        }
        catch (Exception ex){
            throw new Exception("New info from method1()", ex);
        }
    }

    public static void method2() throws Exception{
        throw new Exception("New info from method2()");
    }

}

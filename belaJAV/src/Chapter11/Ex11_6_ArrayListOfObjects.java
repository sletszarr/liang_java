package Chapter11;

import mylib.Circle2D;
import mylib.Loan;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bnamora on 10/18/16.
 */

public class Ex11_6_ArrayListOfObjects {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<Object>();

        list.add(new Loan());
        list.add(new Date());
        list.add("Ollaa laa");
        list.add(new Circle2D());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}

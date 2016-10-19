package Chapter11;

import java.util.ArrayList;

/**
 * Created by bnamora on 10/19/16.
 */

public class Ex11_4_Combine2Lists {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // populate list1
        for (int i = 0; i < 5; i++) {
            int randNum = (int) (Math.random() * 10);
            list1.add(randNum);
        }

        // display list1
        System.out.println(list1.toString());

        // populate list 2
        for (int i = 0; i < 7; i++) {
            int randNum = (int) (Math.random() * 10);
            list2.add(randNum);
        }

        // display list2
        System.out.println(list2.toString());

        // combine list and display
        System.out.println(union(list1, list2).toString());

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> combined = new ArrayList<Integer>();

        for (int i = 0; i < list1.size(); i++) {
            combined.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            combined.add(list2.get(i));
        }

        return combined;
    }
}

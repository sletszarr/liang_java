package Chapter11;

import java.util.ArrayList;

/**
 * Created by bnamora on 10/18/16.
 */
public class Ex11_7_ShuffleArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        // populate the numberList
        for (int i = 0; i < 10; i++) {
            int randNum = (int) (Math.random() * 100);
            numberList.add(randNum);
        }

        // print the number list
        System.out.println(numberList.toString());

        // shuffle numberList
        shuffle(numberList);

        // print the number list
        System.out.println(numberList.toString());

    }

    public static void shuffle(ArrayList<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++) {
            int randIdx = (int) (Math.random() * numberList.size());

            // swap numberList[i] with numberList[randIdx]
            Integer temp = numberList.get(i);
            numberList.set(i, numberList.get(randIdx));
            numberList.set(randIdx, temp);
        }
    }

}

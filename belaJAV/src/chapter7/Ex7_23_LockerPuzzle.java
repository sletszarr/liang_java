package chapter7;

/**
 * Created by Acer-756 on 7/7/2016.
 */

public class Ex7_23_LockerPuzzle {

    public static void main(String[] args) {

        boolean[] locker = new boolean[100];

        // student 1
        // starting with locker#1,
        // open every locker
        for (int i = 0; i < locker.length; i++) {
            locker[i] = true;
        }
        System.out.println("Student #1");
        displayLocker(locker);

        // student 2
        // starting with locker#2,
        // close every other locker
        for (int i = 1; i < locker.length; i++) {
            locker[i] = false;
        }
        System.out.println("Student #2");
        displayLocker(locker);

        // student 3-100
        // starting with locker#(Student#)
        // close every (Student#)-th locker
        for (int i = 2; i < locker.length; i++) {

            System.out.println("Student #" + (i + 1));
            for (int k = i; k < locker.length; k++) {
                if ((k + 1) % (i + 1) != 0) {
                    continue;
                }
                locker[k] = !locker[k];
            }
            displayLocker(locker);
        }

    }

    public static void displayLocker(boolean[] locker) {
        for (int i = 0; i < locker.length; i++) {
            System.out.print((locker[i]) ? "Opened  " : "closed  ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

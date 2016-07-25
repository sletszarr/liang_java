package chapter10;

import mylib.Queue;

/**
 * Created by bnamora on 7/24/16.
 */
public class Ex10_10_TestQueue {

    public static void main(String[] args) {

        // create queue object
        Queue q = new Queue();

        // push 10 random values
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 100);
            q.enqueue(rand);
        }

        // pop
        while (!q.isEmpty()) {
            System.out.print(q.dequeue()+" ");
        }

    }
}

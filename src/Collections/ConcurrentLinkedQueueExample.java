package Collections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        queue.add(5);
        queue.add(7);
        queue.add(8);
        queue.add(11);
        System.out.println(queue);
        System.out.println(queue.remove(8));
        System.out.println(queue);
        System.out.println(queue.size());

    }
}

import java.util.*;
import java.lang.*;


public class QueueExample {

    public static void main(String[] args) throws InterruptedException {
        //int time = Integer.parseInt(args[0]);
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= 5; i++) {
            queue.add(i);
            System.out.println("Value added in Queue: "+i);
        }

        while (!queue.isEmpty()) {

            System.out.println("Value removed in Queue is:  "+queue.remove());
            Thread.sleep(1000);
        }

        System.out.println("Queue peek to see the value: "+queue.peek());
    }
}
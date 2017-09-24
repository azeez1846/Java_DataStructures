import java.util.LinkedList;
import java.util.Queue;

public class Queue3 {
    public static void main(String[] args) throws InterruptedException{
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i=0; i<5 ; i++){
            System.out.println("Value added in Queue: "+i);
            queue.add(i);

        }

        while(!queue.isEmpty()){

            System.out.println("Value removed from Queue: "+queue.poll());

            Thread.sleep(1000);

        }

        System.out.println("Queue peek to see the existing value: "+queue.peek());

    }
}

package Week8.Core;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import javax.management.Query;

public class Program {

    public static void main(String[] args) {
        /**
         * Vector
         * Stack
         * Queue
         */
        Stack stack = new Stack<>();
        stack.add("1");
        stack.add(2);
        stack.add(true);
        stack.add(3.5);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        MyQueue<Double> queue = new MyQueue();
        queue.add(1.5);
        queue.add(2.5);
        queue.add(4.5);
        queue.add(3.5);
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);

        /**
         * Dictionary
         * Hashtable
         * Enumeration
         * Random Number Generation
         */
        // 
            ArrayList<Hashtable> list = new ArrayList<>();
            Hashtable hashtable = new Hashtable<>();
            hashtable.put("name", "Binit Koirala");
            hashtable.put("age", "25");
            list.add(hashtable);
            Hashtable hashTableTwo = new Hashtable<>();

            
            hashTableTwo.put("name", "Aasis Paudel");
            hashTableTwo.put("age", "23");
            list.add(hashTableTwo);
            System.out.println(list);
            for(Hashtable h: list) {
                System.out.println(h.get("name") + ", " + h.get("age"));
                
            }
    }
}

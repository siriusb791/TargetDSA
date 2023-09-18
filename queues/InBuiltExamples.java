package queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InBuiltExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println(queue.add(231));
        queue.add(12);
        queue.add(222);
        System.out.println(queue.remove());
        Deque<Integer> deque = new LinkedList<>();


    }

}

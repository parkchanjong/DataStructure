package heap;

import java.util.*;

public class MaxHeap {
    public static void main() {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.offer(3);
        pq.offer(1);
        pq.offer(4);
        pq.offer(2);
        pq.offer(5);
        while(!pq.isEmpty()) {
            int element = pq.poll();
            System.out.println(element);
        }

    }
}

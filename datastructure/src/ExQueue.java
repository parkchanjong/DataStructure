import java.util.*;

public class ExQueue {
    public static void main() {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            queue.offer(i);
        }
        while(!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println(element);
        }
    }
}
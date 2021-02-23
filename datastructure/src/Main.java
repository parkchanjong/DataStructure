import java.util.*;

public class Main {
    public static void main(String[] args) {
        ExStack st = new ExStack();
        st.main();
        System.out.println("-------------------------------");

        ExQueue qu = new ExQueue();
        qu.main();
        System.out.println("-------------------------------");

        MaxHeap maxheap = new MaxHeap();
        maxheap.main();
        System.out.println("-------------------------------");

        MinHeap minheap = new MinHeap();
        minheap.main();
        System.out.println("-------------------------------");
    }
}
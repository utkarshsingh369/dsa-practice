package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueMinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(3);
        heap.add(1);
        heap.add(6);
        heap.add(5);
        heap.add(2);
        heap.add(8);

        System.out.println(heap.toString());

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

    }
}

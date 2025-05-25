package heap;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class Rough {
    public static void main(String[] args) {
        PriorityQueue<AbstractMap.SimpleEntry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<AbstractMap.SimpleEntry<Integer, Integer>>() {
            @Override
            public int compare(SimpleEntry<Integer, Integer> arg0, SimpleEntry<Integer, Integer> arg1) {
                if(arg0.getKey()<arg1.getKey()){
                    return 1;
                }else{
                    return -1;
                }
            }
            
        });
        heap.add(new AbstractMap.SimpleEntry<>(2,3));
        heap.add(new AbstractMap.SimpleEntry<>(3,4));
        heap.add(new AbstractMap.SimpleEntry<>(5,4));
        heap.add(new AbstractMap.SimpleEntry<>(1,4));
        heap.add(new AbstractMap.SimpleEntry<>(4,4));
        System.out.println(heap.toString());
        
    }
}

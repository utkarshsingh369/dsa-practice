package recursion.IBH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayRecur {
    private static void insertAtCorrectPosition(List<Integer> list, int popped){
        if(list.isEmpty() || list.get(list.size()-1)<=popped){
            list.add(popped);
            return;
        }
        int temp= list.remove(list.size()-1);
        insertAtCorrectPosition(list, popped);
        list.add(temp);
    }
    private static void sort(List<Integer> list){
        if(list.size()==1){
            return;
        }
        int popped=list.remove(list.size()-1);
        sort(list);
        insertAtCorrectPosition(list, popped);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 4, 1, 54, 5, 3, 2));
        sort(list);
        System.out.println(list);

      }
}

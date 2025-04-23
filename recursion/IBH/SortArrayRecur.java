package recursion.IBH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayRecur {
    private static void insertAtCorrectPosition(List<Integer> list, int elem){
        if(list.isEmpty() || list.get(list.size()-1)<=elem){
            list.add(elem);
            return;
        }
        int temp = list.remove(list.size()-1);
        insertAtCorrectPosition(list, elem);
        list.add(temp);
    }
    private static void sort(List<Integer> list){
        if(list.size()==1){
            return;
        }
        int lastElem = list.remove(list.size()-1);
        sort(list);
        insertAtCorrectPosition(list, lastElem);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 4, 1, 54, 5, 3, 2));
        sort(list);
        System.out.println(list);

      }
}

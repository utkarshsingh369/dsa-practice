package recursion.IBH;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    private static int util(List<Integer> list, int i, int k){
        if(list.size()==1){
            return list.get(0);
        }
        list.remove(i);
        return util(new ArrayList<>(list), (i+(k-1))%list.size(), k);
    }
    public static void main(String[] args) {
        int n=6;
        int k=5;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        System.out.println(util(list, (k-1)%n, k));
    }
}

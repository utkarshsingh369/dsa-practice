package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        double res = 1; // double; as it may cross the integer limit
        for (int i = 1; i <= rowIndex; i++) {
            res = res * (rowIndex - (i - 1));
            res = res / i;
            ans.add((int) res);
        }
        return ans;
    }
}

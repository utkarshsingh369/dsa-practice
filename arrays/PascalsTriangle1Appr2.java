package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle1Appr2 {
     /**
        * Approach 1: Go on adding by keeping 1st and last as one
        * Solution: not needed
    */

    /**
        * Approach 2: Value at row index r and column index c = rCc
        * Solution: 
    */ 

    private int findNcr(int n, int r){
        /** since, 10C3 = (10*9*8)/(1*2*3) */
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }

    public List<List<Integer>> generate(int numRows) {
        Integer[][] ans= new Integer[numRows][];
        Integer[] temp;
        for(int i=0;i<numRows;i++){
            temp=new Integer[i+1];
            for(int j=0;j<=i;j++){
                temp[j]=findNcr(i,j);
            }
            ans[i]=temp;
        }
        return Arrays.stream(ans).map(Arrays::asList).collect(Collectors.toList());
    }
}

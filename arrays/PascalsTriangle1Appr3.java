package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle1Appr3 {
    /**
        * Approach 1: Go on adding by keeping 1st and last as one
    */

    /**
        * Approach 2: Value at row index r and column index c = rCc
    */ 

    /**
        * Approach 3: deduce the values at columns on each row
        * notice the pattern for each column value 
        * learn how to initialize a variable of type List<List<Integer>>
    */

    private Integer[] findPascalRow(int rowIndex){
        Integer res[] = new Integer[rowIndex + 1];
        int temp=1;
        res[0]=temp;
        for(int i=1;i<=rowIndex;i++){
            temp=temp*(rowIndex-(i-1));
            temp=temp/i;
            res[i]=temp;
        }
        return res;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(Arrays.asList(findPascalRow(i)));
        }
        return ans;
    }
}

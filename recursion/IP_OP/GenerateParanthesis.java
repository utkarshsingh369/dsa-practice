package recursion.IP_OP;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis{
    private static List<String> util(int left, int right, String str, int n, List<String> result){
        if(left==n && right==n){
            result.add(str);
            return result;
        }
        if(left<=n){
            result = util(left+1, right, str+"(", n, result);
        }
        if(left>right){
            result = util(left, right+1, str+")", n, result);
        }
        return result;
    }
    public static void main(String[] args) {
        int n=3;
        List<String> result = new ArrayList<>();
        result = util(0, 0, "", n, result);
        System.out.println(result);
    }
}
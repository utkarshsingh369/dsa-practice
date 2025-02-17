package recursion.IP_OP;

import java.util.ArrayList;
import java.util.List;

public class NBitNumbersWithMore1s {
    static List<String> util(int countOfOnes, int countOfZeroes, String prefix, int n, List<String> result){
        if(countOfOnes+countOfZeroes ==n){
            result.add(prefix);
            return result;
        }
        result = util(countOfOnes+1, countOfZeroes, prefix+"1", n, result);
        if(countOfOnes>countOfZeroes){
            result = util(countOfOnes, countOfZeroes+1, prefix+"0", n, result);
        }
        return result;
    }
    public static void main(String[] args) {
        int n= 5;
        List<String> result = new ArrayList<>();
        result = util(0, 0, "", n, result);
        System.out.println(result);
    }
}

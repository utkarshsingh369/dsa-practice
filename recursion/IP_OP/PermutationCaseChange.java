package recursion.IP_OP;

import java.util.ArrayList;
import java.util.List;

public class PermutationCaseChange {
    static List<String> util(String input, String output, List<String> result){
        if(input.length()==0){
            result.add(output);
            return result;
        }
        if(isNumber(input.charAt(0))){
            result = util(input.substring(1), output+input.charAt(0), result);
        }else{
            result = util(input.substring(1), output+input.charAt(0), result);
            result = util(input.substring(1), output + invertCase(input.charAt(0)), result);
        }
        return result;
    }
    static boolean isNumber(char c){
        return (c<=57 && c>=48);
    }
    static String invertCase(char c){
        if(c>='a' && c<='z'){
            return (c+"").toUpperCase();
        }
        return (c+"").toLowerCase();
    }
    public static void main(String[] args) {
        String s = "8c0Aa9B7";
        List<String> result = new ArrayList<>();
        result = util(s, "", result);
        System.out.println(result);
    }
}

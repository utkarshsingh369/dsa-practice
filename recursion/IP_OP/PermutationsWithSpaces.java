package recursion.IP_OP;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithSpaces {
    private static void util(StringBuilder input, StringBuilder output, List<String> result){
        if (input.length() == 0) {
            result.add("(" + output.toString() + ")");
            return;
        }
        char temp = input.charAt(0);
        input.deleteCharAt(0);
        output.append("_"+temp);
        util(new StringBuilder(input), new StringBuilder(output), result);
        output.deleteCharAt(output.length()-2);
        util(new StringBuilder(input), new StringBuilder(output),result);
    }
    
    public static void main(String[] args) {
        String input = "ABC";
        StringBuilder sbIn = new StringBuilder(input);
        StringBuilder sbOut = new StringBuilder("");
        List<String> result = new  ArrayList<>();
        sbOut.append(sbIn.charAt(0));
        sbIn = sbIn.deleteCharAt(0);
        util(sbIn, sbOut, result);
        System.out.println(result);
    }
}

package recursion.IP_OP;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSums {
     private static ArrayList<Integer> util(ArrayList<Integer> input, ArrayList<Integer> output, ArrayList<Integer> result){
        if(input.size()==0){
            int sum=0;
            for(int elem: output){
                sum+=elem;
            }
            result.add(sum);
            return result;
        }
        int temp = input.remove(0);
        result = util(new ArrayList<>(input), new ArrayList<>(output), result);
        output.add(temp);
        result = util(new ArrayList<>(input), new ArrayList<>(output), result);
        return result;
    }
    public static void main(String[] args) {
        Integer arr[] = {2,3};
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(arr));
        
        System.out.println(util(input, new ArrayList<Integer>(), result));
    }
}

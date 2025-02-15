package recursion.IP_OP;

import java.util.ArrayList;
import java.util.List;

public class Permutations1Appr1 {
    private void recurUtil(int[] nums, List<List<Integer>> result, List<Integer> temp, boolean[] tracker){
        // 1. Base condition
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        // 2. What to do at each step
        for(int i=0;i<nums.length;i++){
            if(!tracker[i]){
                tracker[i]=true;
                temp.add(nums[i]);
                recurUtil(nums,result, temp, tracker);
                // 3. How to return after meeting the base condition
                temp.remove(temp.size()-1);
                tracker[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> temp=new ArrayList<Integer>();
        boolean[] tracker=new boolean[nums.length];
        recurUtil(nums, result, temp, tracker);
        return result;
    }
}

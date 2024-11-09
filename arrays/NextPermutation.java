package arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        // 1. Find the first pit
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        // 2. no pit means, no next is possible, hence reverse whole array
        if(index==-1){
            reverse(nums,0,n-1);
        }else{
            // 3. find the "just greater" value in right side (which will be first elem from right, which is greater) and swap
            for(int i=n-1;i>index;i--){
                if(nums[i]>nums[index]){
                    nums[i]=nums[i]+nums[index];
                    nums[index]=nums[i]-nums[index];
                    nums[i]=nums[i]-nums[index];
                    break;
                }
            }
            // 4. reverse the right side, to make the decreasing slope as increasing
            reverse(nums, index+1,n-1);
        }
    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            nums[start]=nums[start]+nums[end];
            nums[end]=nums[start]-nums[end];
            nums[start]=nums[start]-nums[end];
            start++;
            end--;
        }
    }
}

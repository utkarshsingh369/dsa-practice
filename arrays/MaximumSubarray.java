package arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        // paida hone pe na dukh hai na sukh
        int aggr=0;
        // jeevan ke harr ek padaav pe...
        for(int num:nums){
            // anubhav ko batorte chalo
            aggr+=num;
            // agar abhi tak anubhav, jeevan ke sabhi anubhavo se adhik sukhad hai...
            if(aggr>max){
                // to isse acknowledge karo, aur yaad rakho
                max=aggr;
            }
            // agar abhi tak ke kul anubhav dukhad hi hain...to unhe bhul jaao aur...
            if(aggr<0){
                // naye sire se shuruaat karo
                aggr=0;
            }
        }
        return max;
    }
}

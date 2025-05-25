package sliding_window;

import java.util.Arrays;

public class MaxInEachWindow {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int i=0;
        int j=0;
        int currentMaxIndex=0;
        int[] res = new int[arr.length-k+1];
        int x = 0;
        while(j<arr.length){
            if(arr[j]>=arr[currentMaxIndex]){
                currentMaxIndex=j;
            }
            if(j-i+1 == k){
                res[x++]=arr[currentMaxIndex];
                if(i==currentMaxIndex){
                    j=i;
                }
                i++;
            }else{
                j++;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1,12,24,5,23,7,8,9,18,20,11,5,34,23,12,2,1,32,3,2,4,2,2,3,4};
        int k=3; 
        System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
    }
}

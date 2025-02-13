package recursion;

// no of steps can directly calculated by 2^n - 1

public class TowerOfHanoi {
    private void util(int n,int from, int to, int aux, int[] count){
        if(n==1){
            count[0]++;
            return;
        }
        util(n-1,from, aux, to, count);
        count[0]++;
        util(n-1, aux, to, from, count);
    }
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        if(n==0){
            return 0;
        }
        int[] count={0};
        util(n,from, to, aux, count);
        return count[0];
        // return ((int)Math.pow(2,n))-1;
    }
}

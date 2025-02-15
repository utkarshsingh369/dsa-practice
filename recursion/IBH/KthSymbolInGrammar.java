package recursion.IBH;

public class KthSymbolInGrammar {
    public int kthGrammar(int n, int k) {
        if(n==1 && k ==1){
            return 0;
        }
        int mid=(int)Math.pow(2,(n-1))/2;
        if(k<=mid){
            return kthGrammar(n-1, k);
        }else{
            return complement(kthGrammar(n-1, k-mid));
        }
    }
    private int complement(int val){
        if(val==0){
            return 1;
        }
        return 0;
    }
}

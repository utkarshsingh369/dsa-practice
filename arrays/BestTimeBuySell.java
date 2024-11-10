package arrays;

public class BestTimeBuySell {
    public int maxProfit(int[] prices) {
        int boughtAt=prices[0], curProfit=0, maxProfit=0;
        for(int i=0;i<prices.length;i++){
            curProfit=prices[i]-boughtAt;
            if(curProfit<0){
                boughtAt=prices[i];
            }else{
                if(curProfit>maxProfit){
                    maxProfit=curProfit;
                }
            }
        }
        return maxProfit;
    }
}

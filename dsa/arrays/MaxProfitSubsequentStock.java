package dsa.arrays;

public class MaxProfitSubsequentStock {

    public int maxProfit(int[] prices) {


        int n = prices.length;
        int maxProfit = 0;

        for(int i = 1 ;i < n; i++){

            if(prices[i] - prices[i-1] > 0){
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}

package dsa.leetcode;

public class StockBestBuyTwo {

    public int maxProfit(int[] prices) {

        int n = prices.length;
        int profit = 0;
        for(int i = 1; i < n ; i++){

            int currProfit = prices[i] - prices[i-1];
            if(currProfit > 0){
                profit += currProfit;
            }
        }

        return profit;
    }
}

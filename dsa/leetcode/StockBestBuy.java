package dsa.leetcode;

public class StockBestBuy {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int smallRange = prices[0];

        int len = prices.length;

        for(int i = 1; i < len ;i++){

            int currProfit = prices[i] - smallRange;
            if(currProfit > profit){
                profit = currProfit;
            }
            if(prices[i] < smallRange){
                smallRange = prices[i];
            }
        }

        return profit;
    }

    public static void main(String[] args) {


    }
}

package dsa.arrays;

public class MaxProfitStock {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int profit = 0;
        int profitifSoldToday = 0;
        int lsf = Integer.MAX_VALUE;



        for(int i = 0; i < n; i++){

            if(prices[i] < lsf){
                lsf = prices[i];
            }

            profitifSoldToday = prices[i] - lsf;

            if(profitifSoldToday > profit){
                profit = profitifSoldToday;
            }

        }

        return profit;

    }
}

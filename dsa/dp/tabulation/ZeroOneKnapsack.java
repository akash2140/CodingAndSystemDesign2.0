package dsa.dp.tabulation;

public class ZeroOneKnapsack {

    static int result[][] ;
    public static void main(String[]args){

        Integer wt [] = {1,3,4,10};
        Integer pr [] = {1,4,5,7};

        Integer capacity = 10;
        result = new int[wt.length + 1][capacity + 1];

        //Intialising with -1
        for(int i = 0 ;i < result.length ; i++){
            for(int j = 0; j < result[i].length ; j++){
                result[i][j] = -1;
            }
        }
        System.out.println(knapSack(capacity,wt,pr,wt.length));
    }


    static int dp[][];
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(Integer W, Integer wt[], Integer val[], Integer n)
    {
        // your code here
        dp = new int[n+1][W+1];

        for(int i=0;i<n;i++){
            dp[i][0] = 0;
        }

        for(int i = 0; i < W; i++){

            dp[0][i] = 0;
        }

        for(int i=1 ; i<=n; i++){

            for(int j=1; j<=W; j++){

                if(wt[i-1] <= j){
                    dp[i][j] = Math.max((val[i-1] + dp[i-1][j-wt[i-1]]) , (dp[i-1][j]));
                } else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }

}

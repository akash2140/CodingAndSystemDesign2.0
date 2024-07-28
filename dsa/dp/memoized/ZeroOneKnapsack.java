package dsa.dp.memoized;

public class ZeroOneKnapsack {


    static int result[][] ;
    public static void main(String[]args){

        Integer wt [] = {1,3,4,10};
        Integer pr [] = {1,4,5,7};

        Integer capacity = 10;
        result = new int[wt.length + 1][capacity + 1];

        //Intialising with -1
        for(int i = 0 ;i < result.length ; i++){
            for(int j = 0; j< result[i].length ; j++){
                result[i][j] = -1 ;
            }
        }

        System.out.println(knapsack(wt,pr,capacity,wt.length));
    }

    private static int knapsack(Integer[] wt, Integer[] pr, Integer capacity, int n) {

        if( n == 0 || capacity == 0){
            return 0;
        }

        if(result[n][capacity] != -1){
            return result[n][capacity];
        }

        if(wt[n-1] <=  capacity){

            result[n][capacity]  = Math.max(
                    (pr[n-1] + knapsack(wt, pr, capacity - wt[n-1] , n-1)) ,
                    (knapsack(wt, pr, capacity, n-1)));

        }else{
            result[n][capacity]  = knapsack(wt, pr, capacity, n-1);
        }

        return result[n][capacity];
    }

}

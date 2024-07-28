package dsa.dp.memoized;

import java.lang.reflect.Parameter;

public class SubsetSum {

    static int[][] result;
    public static void main(String[] args) {

        Integer arr [] = { 3, 34, 4, 12, 5, 2 };
        Integer sum = 12;

        result = new int[arr.length + 1][sum + 1];

        //Intialising with -1
        for(int i = 0 ;i < result.length ; i++){
            for(int j = 0; j< result[i].length ; j++){
                result[i][j] = -1 ;
            }
        }

        if(targetSum(arr, sum, arr.length) != 0){
            System.out.println( true);
        }else{
            System.out.println( false);
        }
    }

    private static int targetSum(Integer[] arr, Integer sum, int n) {

        if(n == 0){
            return 0;
        }
        if(sum == 0){
            return 1;
        }
        if(result[n][sum] != -1){
            return result[n][sum];
        }

        if(arr[n-1] > sum){
           return result[n-1][sum] = targetSum(arr, sum , n-1);
        }else{

            if(targetSum(arr, sum - arr[n-1], n-1 ) != 0 || targetSum(arr, sum, n-1) != 0){
                return result[n-1][sum] = 1;
            }else{
                return result[n-1][sum] = 0;
            }
        }
    }
}

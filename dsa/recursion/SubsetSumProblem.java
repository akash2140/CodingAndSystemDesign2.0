package dsa.recursion;


public class SubsetSumProblem {


    public static void main(String[] args) {

        Integer arr [] = { 3, 34, 4, 12, 5, 2 };
        Integer sum = 14;

        System.out.println( targetSum(arr, sum, arr.length));
    }

    private static boolean targetSum(Integer[] arr, Integer sum, int n) {

        if(n==0){
            return false;
        }
        if(sum == 0){
            return true;
        }

        if(arr[n-1] <= sum){
            return targetSum(arr, sum - arr[n-1] , n-1) || targetSum(arr, sum , n-1);
        }else{
            return targetSum(arr, sum  , n-1);
        }
    }
}

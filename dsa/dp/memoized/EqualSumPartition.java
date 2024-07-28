package dsa.dp.memoized;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class EqualSumPartition {

    static int result[][];

    public static void main(String[] args) {

//        int arr[] = {1,5,11,5};
        int arr[] = {2, 10, 8, 2};

        System.out.println(canPartition(arr));
    }

    private static boolean canPartition(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum % 2 != 0) {
            return false;
        } else {
            int halfSum = sum / 2;
            result = new int[arr.length + 1][halfSum + 1];

            //Intialising with -1
            for(int i = 0 ;i < result.length ; i++){
                for(int j = 0; j< result[i].length ; j++){
                    result[i][j] = -1 ;
                }
            }

            if (subsetSum(arr, halfSum, arr.length) != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static int subsetSum(int[] arr, int sum, int n) {

        if (n == 0) {
            return 0;
        }

        if (sum == 0) {
            return 1;
        }

        if (result[n][sum] != -1) {
            return result[n][sum];
        }


        if (arr[n - 1] <= sum) {
            if (subsetSum(arr, sum - arr[n - 1], n - 1) != 0 || subsetSum(arr, sum, n - 1) != 0) {
                return result[n - 1][sum] = 1;
            } else {
                return result[n - 1][sum] = 0;
            }
        }else{
            return result[n - 1][sum] = 0;
        }
    }
}

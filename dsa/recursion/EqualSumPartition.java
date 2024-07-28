package dsa.recursion;

public class EqualSumPartition {
    public static void main(String[] args) {

//        int arr[] = {1,5,11,5};
        int arr[] = {2,10,8,2};
        System.out.println(canPartition(arr));
    }

    private static boolean canPartition(int[] arr) {

        int sum = 0;
        for(int i=0 ; i< arr.length ; i++){
            sum += arr[i];
        }

        if(sum % 2 != 0){
            return false;
        }else{
            return subsetSum(arr,sum/2,arr.length);
        }
    }

    private static boolean subsetSum(int[] arr, int sum, int n) {

        if(n==0){
            return false;
        }
        if(sum == 0){
            return true;
        }

        if(arr[n-1] <= sum){
            return subsetSum(arr, sum - arr[n-1], n-1) || subsetSum(arr, sum , n-1);
        }else{
            return subsetSum(arr, sum , n-1);
        }
    }
}

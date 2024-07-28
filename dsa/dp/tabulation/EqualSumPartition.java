package dsa.dp.tabulation;

public class EqualSumPartition {


    static Boolean result[][];
    public static void main(String[] args) {

        int arr[] = {1,5,11,5};
       // int arr[] = {2,10,8,2};
        System.out.println(canPartition(arr));
    }


    public static boolean canPartition(int[] arr) {

        int sum = 0;
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            sum += arr[i];
        }

        if (sum % 2 != 0) {
            return false;
        } else {
            result = new Boolean[arrayLength + 1][ (sum/2) + 1];
            return subsetSum(arr, sum/2, arrayLength);
        }
    }

    private static boolean subsetSum(int[] arr, int sum, int n) {

        int resultlength = result.length;
        for(int i = 0; i < resultlength; i++){
            result[i][0] = true;
        }

        int sumLength = result[0].length;
        for(int j = 1; j< sumLength; j++){
            result[0][j]= false;
        }


        for(int i = 1; i< resultlength; i++){
            for(int j = 1; j < sumLength; j++){

                if(arr[i-1] <= j){
                    result[i][j] = result[i-1][j-arr[i-1]] || result[i-1][j];
                }else{
                    result[i][j] = result[i-1][j];
                }
            }
        }

        return result[n][sum];
    }
}

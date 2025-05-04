package dsa.dp.tabulation;


public class SubsetSum {

    static Boolean[][] result;
    public static void main(String[] args) {

        Integer arr [] = { 3, 34, 4, 12, 5, 2 };
        Integer sum = 1;
        result = new Boolean[arr.length + 1][sum + 1];

        System.out.println(targetSum(arr, sum, arr.length));
    }

    private static Boolean targetSum(Integer[] arr, Integer sum, int length) {

        for(int i=0;i < result.length;i++){
            result[i][0] = true;
        }

        for(int i = 1 ; i < result[0].length ; i++){
            result[0][i] = false;
        }

        for(int i = 1 ; i <= length ; i++){
            for(int j = 1; j <= sum ; j++){
                if(arr[i-1] <= j){

                    result[i][j] = result[i-1][j-arr[i-1]] || result[i-1][j];
                }else{
                    result[i][j] = result[i-1][j];
                }
            }
        }

        return result[length][sum];
    }
}

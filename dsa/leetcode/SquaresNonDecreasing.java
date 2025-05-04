package dsa;

public class SquaresNonDecreasing {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int i = 0, j = n-1, k = n-1;
        int result[] = new int[n];

        while( i < n && j >= 0 && k>=0){

            if(Math.abs(nums[i]) < Math.abs(nums[j])){

                result[k--] = nums[j] * nums[j];
                j--;
            }else{
                result[k--] = nums[i] * nums[i];
                i++;
            }
        }

        return result;
    }
}

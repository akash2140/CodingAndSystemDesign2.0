package dsa.leetcode;

public class PivotIndex {

    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int leftSum = 0;
        int sum = 0;

        for(int i = 0;i<n;i++){
            sum += nums[i];
        }

        for( int i = 0; i<n ; i++){

            int rSum = sum - leftSum - nums[i];
            if(rSum == leftSum){
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}

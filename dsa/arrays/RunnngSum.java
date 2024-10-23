package dsa.arrays;

public class RunnngSum {

    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for(int i = 0; i<n ; i++){

            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}

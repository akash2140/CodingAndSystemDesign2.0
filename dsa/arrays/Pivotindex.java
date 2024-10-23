package dsa.arrays;

public class Pivotindex {

    public int pivotIndexBruteForce(int[] nums) {

        int n = nums.length;
        int sum= 0;

        int leftSumArr[] = new int[n];
        int rightSumArr[] = new int[n];

        for(int i = 0 ;i<n; i++){
            leftSumArr[i]= 0;
        }
        for(int i = 0 ;i<n; i++){
            rightSumArr[i]= 0;
        }

        for(int i = 0 ;i<n; i++){
            sum += nums[i];
            leftSumArr[i] = sum + nums[i];
        }
        sum = 0;
        for(int i = n-1 ; i>=0; i--){
            sum += nums[i];
            rightSumArr [i] = sum + nums[i];
        }

        for(int i = 0; i<n ; i++){

            if(leftSumArr[i] == rightSumArr[i]){
                return i;
            }
        }

        return -1;
    }

    public int pivotIndex(int[] nums) {

        int totalSum= 0;
        int n = nums.length;

        for(int i = 0; i<n ; i++){
            totalSum += nums[i];
        }
        int leftSum = 0;

        for(int i = 0; i<n ;i++){

            int rightSum = totalSum - leftSum - nums[i];

            if(rightSum == leftSum){
                return i;
            }

            leftSum = leftSum + nums[i];
        }


        return -1;
    }

}

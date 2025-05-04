package dsa.arrays;

import java.util.Arrays;

public class SquaresSortedElements {

    public int[] sortedSquaresUsingSorting(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int arr[] = new int[n];

        int i= 0, j = n - 1 , k= n - 1;

        while( i < n && j >=0 && k >=0){

            if(Math.abs(nums[i]) < Math.abs(nums[j])){

                arr[k] = nums[j] * nums[j];
                j--;
                k--;
            }else{

                arr[k] = nums[i] * nums[i];
                i++;
                k--;
            }
        }

        return arr;
    }
}
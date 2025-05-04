package dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public int subarraySumBruteForce(int[] nums, int k) {

        int n = nums.length;
        int result = 0;

        for(int i = 0; i<n; i++){
            
            int sum = nums[i];
            if(sum == k){
                result++;
            }

            for(int j = i+1 ; j<n; j++){

                sum += nums[j];

                if(sum == k){
                    result++;
                }
            }
        }

        return result;
    }

    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int count = 0;


        Map<Integer,Integer> prefixSum = new HashMap<>();
        Integer target = k;
        prefixSum.put(0,1);

        Integer sum = 0;
        for(int  i = 0;i < n; i++){

            sum += nums[i];
            if(prefixSum.containsKey(sum-target)){
                count++;
            }

            prefixSum.put(sum, 1);
        }

        return count;

    }
}

package dsa.leetcode;

import java.util.HashMap;

public class TwoSum {


    public int[] twoSumBruteForce(int[] nums, int target) {

        int [] result = new int[2];
        int len = nums.length;
        for(int i = 0; i<len; i++ ){
            result[0] = i;
            for(int j=i+1; j< len; j++){
                if(nums[i] + nums[j] == target){
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        int len = nums.length;
        HashMap<Integer,Integer> checkMap = new HashMap<>();
        checkMap.put(nums[0], 0);
        for(int i = 1; i<len; i++){

            int checkTarget = target - nums[i];
            if(checkMap.containsKey(checkTarget)){
                result[0] = i;
                result[1] = checkMap.get(checkTarget);
            }else{
                checkMap.put(nums[i], i);
            }
        }
        return result;
    }
    public static void main(String[] args) {


    }
}

package dsa.arrays;

import java.util.*;

class TwoSum {


    //BruteForce
    static int[] result = new int[2];
    static Map<Integer,Integer> arrayHashMap = new HashMap<>();
    public int[] twoSumBruteForce(int[] nums, int target) {

        int len = nums.length;
        for(int i= 0; i< len; i++){

            for(int j = i +1 ; j< len; j++){
                
                if(nums[i] + nums [j ] == target){
                    result [0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSumUsingHashMap(int[] nums, int target) {


        int curr = 0;
        for(int i = 0 ; i < nums.length; i++){

            curr = target - nums[i];

            if(arrayHashMap.containsKey(curr)){

                result[0]=arrayHashMap.get(curr);
                result[1]=i;

                return result;
            }
            arrayHashMap.put(nums[i],i);
        }


        return result;
    }
}
package dsa.leetcode;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int len = nums.length;
        int zeroCount = 0;

        for(int i = 0; i<len; i++){

            if(nums[i] == 0){
                zeroCount++;
            }
            else{
                if(nums[i] != 0 && zeroCount > 0){
                    nums[i-zeroCount] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}

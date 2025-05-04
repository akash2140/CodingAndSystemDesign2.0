package dsa.arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {


        int n = nums.length;
        int zeroCount = 0;
        for(int i= 0; i<n ; i++){

            if(nums[i] == 0){
                zeroCount++;
            }
            else {
                if(zeroCount > 0){

                    nums[i- zeroCount] =nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}

package dsa.arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int unique = 0;
        for(int i = 1; i < n; i++){

            if(nums[unique] != nums[i]){

                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique + 1 ;
    }

}

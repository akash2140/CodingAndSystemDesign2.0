package dsa.arrays;

public class ProductExceptSelf {

    public int[] productExceptSelfBruteForce(int[] nums) {

        int n = nums.length;

        int product = 1;
        Boolean zeroExist = false;
        for(int i = 0;i<n ;i++){

            if(nums[i] == 0 && zeroExist.equals(false)){
                zeroExist = true;
            }else {
                product *= nums[i];
            }
        }

        for(int i = 0;i<n; i++){
            if(zeroExist && nums[i] != 0){
                nums[i] = 0;
            }else if(nums[i] == 0){
                nums[i] = product;
            }else{
                nums[i] = product / nums[i];
            }
        }

        return nums;
    }

    public int[] productExceptSelfWithoutDiv(int[] nums) {

        int n = nums.length;
        int rightProduct = 1;

        int ans[] = new int[n];
        ans[0] = 1;
        for(int i = 1;i<n ; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        for(int i = n-1 ;i>=0 ; i--){

            ans[i] = ans[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return ans;
    }
}

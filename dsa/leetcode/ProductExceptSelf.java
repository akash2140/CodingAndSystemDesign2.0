package dsa;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int ans[] = new int[n];
        ans[0] = 1;
        int leftProduct = 1;

        for(int i = 1; i < n; i++){

            leftProduct = leftProduct * nums[i-1];
            ans[i] = leftProduct;
        }

        int rightProduct = nums[n-1];

        for(int i = n-2; i >= 0; i--){

            ans[i] = ans[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return ans;

    }
}

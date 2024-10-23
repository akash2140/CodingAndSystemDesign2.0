package dsa.arrays;

public class PlusOne {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;


        while(j >= 0){

            if( i>=0  && nums2[j] < nums1[i]){

                nums1[k] = nums1[i];
                k--;
                i--;

            }else{

                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
}
package dsa.slidingwindows;

import java.util.ArrayList;
import java.util.List;

public class MaximumInSubArray {

    public static void main(String[] args) {

//        int arr[] = {1,3,-1,-3,5,3,6,7};
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        int k = 3;

        List<Integer> result = slidingInSubArrayMaximum(arr,k);
        result.forEach(value -> System.out.println(value));
    }

    private static List<Integer> slidingInSubArrayMaximum(int[] arr, int k) {

        int n = arr.length;
        Integer max = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();
        int i=0,j=0;

        while(j < n){

            if(arr[j] > max){
                max = arr[j];
            }

            if(j-i+1 < k){
                j++;
            }else if(j - i + 1 == k){

                result.add(max);

                if(arr[i] == max){

                    max= Integer.MIN_VALUE;
                    //We would need to find second highest element and put it to max.
                    for(int z = i+1 ; z<=j; z++){
                        if(max < arr[z]){
                            max = arr[z];
                        }
                    }

                }

                i++;
                j++;
            }
        }

        int size = result.size();
        int [] nums =   new int[size];


        for(int ii =0 ;ii< size; ii++){
            nums[ii] = result.get(ii);
        }

        return result;
    }
}

package dsa.slidingwindows;

import java.util.List;

public class MaximumSubArray {

    public static List<Integer> slidingMaximum(final int[] arr, int k) {



        return null;
    }

    public static void main(String[] args) {

        //      int arr[] = {2,5,1,8,2,9,1};
        int arr[] = {12,-1,-7,8,-15,30,16,28};
        int k = 3;

        List<Integer> result = slidingMaximum(arr,k);
        result.forEach( value -> System.out.println(value));
    }
}

package dsa.slidingwindows;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaximumSubArraySizeK {


    public static Integer maxSumSubArrayofSizeK(int arr[], int k){

        int i=0,j=0,n = arr.length;

        int sum = 0;
        Integer max = Integer.MIN_VALUE;

        while(j < n){
            sum += arr[j];

            if(j - i +1 < k){
                j++;
            }else if(j - i + 1 == k){

                max = Integer.max(max,sum);
                sum = sum - arr[i];

                i++;
                j++;
            }
        }
        return max;

    }


    public static long maxSumSubArrayDistinctofSizeK(int arr[], int k){

        int i=0,j=0,n = arr.length;

        int sum = 0;
        long max = Integer.MIN_VALUE;

        Set<Integer> hashset = new LinkedHashSet<>();

        while(j < n){

            sum += arr[j];
            hashset.add(arr[j]);

            if(j - i +1 < k){
                j++;
            }else if(j - i + 1 == k){

                if(hashset.size() == k) {
                    max = max > sum ? max : sum;
                }

                sum = sum - arr[i];
                hashset.remove(arr[i]);

                i++;
                j++;
            }
        }

        return max;
    }
    public static void main(String[] args) {

//        int arr[] = {2,5,1,8,2,9,1};
        int arr[] = {9,9,9,1,2,3};
        int k = 3;

        System.out.println(maxSumSubArrayDistinctofSizeK(arr,k));
    }
}

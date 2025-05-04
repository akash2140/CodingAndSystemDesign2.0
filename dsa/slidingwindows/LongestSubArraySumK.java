package dsa.slidingwindows;

import java.util.List;

public class LongestSubArraySumK {

    public static void main(String[] args) {

        int arr[] = {4, 1, 1, 1, 2, 3, 5};
        int k = 5;

        System.out.println(longestSubArraySumK(arr, k));
    }

    private static long longestSubArraySumK(int[] arr, int k) {

        int n = arr.length, i = 0, j = 0;
        int sum = 0;
        long max = Integer.MIN_VALUE;

        while (j < n) {

            sum += arr[j];

            if (sum < k) {
                j++;
            } else if (sum == k) {
                max = max < (j - i + 1) ? (j - i + 1) : max;
                j++;
            } else {

                while (sum > k) {

                    sum = sum - arr[i];
                    if (sum == k) {
                        max = max < (j - i + 1) ? (j - i + 1) : max;
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}


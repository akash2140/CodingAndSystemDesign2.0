package dsa.slidingwindows;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithNonRepeatingUniqueChars {


    public static void main(String[] args) {


        String str = "abcabcbb";
        str = "bbbb";
        str = "pwwkew";
        str = "aab";
//        System.out.println(longestSubStringWithKUniqueChars(str,3));
//        System.out.println(longestSubStringWithKUniqueChars(str,5));
        System.out.println(longestSubStringWithNonRepeatingUniqueChars(str));
    }

    private static Integer longestSubStringWithNonRepeatingUniqueChars(String str) {

        int n = str.length(), i = 0, j = 0;
        Integer max = Integer.MIN_VALUE;
        Set<Character> hashSet = new HashSet<>();

        while (j < n) {

            if(!hashSet.contains(str.charAt(j))){

                hashSet.add(str.charAt(j));
                j++;
            }else if(hashSet.contains(str.charAt(j))){

                Integer windowSize = j - i;
                max = max > windowSize ? max : windowSize;

                while(hashSet.contains(str.charAt(j))){

                    if(hashSet.contains(str.charAt(i))){
                        hashSet.remove(str.charAt(i));
                        i++;
                    }
                }

                hashSet.add(str.charAt(j));
                j++;
            }
        }

        return max;
    }
}

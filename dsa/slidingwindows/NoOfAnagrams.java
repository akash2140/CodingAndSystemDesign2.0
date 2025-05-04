package dsa.slidingwindows;

import java.util.HashMap;
import java.util.Map;

public class NoOfAnagrams {


    int search(String pat, String s) {
        // code here
        int k = pat.length();
        Map<Character,Integer> patMap = new HashMap<>();
        int count = 0,i=0, j=0, result=0, n= s.length();

        for(int ii = 0; ii < k; ii++){

            if(patMap.containsKey(pat.charAt(ii))){
                patMap.put(pat.charAt(ii) , patMap.get(pat.charAt(ii))+1);
            }else{
                patMap.put(pat.charAt(ii),1);
            }
        }
        count = patMap.size();
        while(j < n){

            if(patMap.containsKey(s.charAt(j))){
                patMap.put(s.charAt(j),patMap.get(s.charAt(j))-1);
                if(patMap.get(s.charAt(j)) == 0){
                    count--;
                }
            }

            if(j-i+1 < k){
                j++;
            }else if(j - i + 1 == k){

                if(count == 0){
                    result++;
                }
                if(patMap.containsKey(s.charAt(i))){
                    patMap.put(s.charAt(i), patMap.get(s.charAt(i))+1);
                    if(patMap.get(s.charAt(i)) == 1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }

        return result;
    }
}

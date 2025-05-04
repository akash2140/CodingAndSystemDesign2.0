package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElementWithhasMap(int[] nums) {

        int n = nums.length;
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int i = 0 ; i<n ; i++){

            if(countMap.containsKey(nums[i])){

                countMap.put(nums[i], (countMap.get(nums[i])).intValue() + 1);
            }else{
                countMap.put(nums[i],1);
            }
        }

        final int[] majEle = {0};
        //Values inside the lambda expression must be final or effectively Final.
        countMap.forEach(
                (mapKey,mapValue) -> {
                    if(mapValue.intValue() > (n/2)){
                        majEle[0] = mapKey;
                    }
                }
        );

        return majEle[0];
    }

    public int majorityElementMooreAlgo(int[] nums) {

        int n = nums.length;
        int count = 0;
        int ele = nums[0];

        for(int i = 0; i<n ; i++){

            if(nums[i]  == ele){
                count++;
            } else if(count == 0){

                ele = nums[i];
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
}
package dsa.arrays;

import java.util.*;

public class MergeInterval {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>(){
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[0] - o2[0];
                    }
                });

        LinkedList<int[]> ans = new LinkedList<>();

        for (int[] interval : intervals) {

            if(ans.isEmpty() || interval[0] > ans.getLast()[1]){
                ans.add(interval);
            } else{
                ans.getLast()[1] = Math.max(ans.getLast()[1],interval[0]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}

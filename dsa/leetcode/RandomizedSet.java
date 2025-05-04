package dsa.leetcode;

import java.util.*;

class RandomizedSet {

    LinkedList<Integer> numList;
    HashMap<Integer,Integer> numIndexMap;

    Random random ;

    public RandomizedSet() {

        numList = new LinkedList<>();
        numIndexMap = new HashMap<>();
        random= new Random();
    }
    
    public boolean insert(int val) {

        if(numList.contains(val)){
            return false;
        }

        numList.add(val);
        numIndexMap.put(val, numList.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {

        if(!numList.contains(val)){
                return false;
        }

        int index = numIndexMap.get(val);

        int lastEle = numList.getLast();
        numList.set(index,lastEle);
        numList.remove(numList.size() - 1);

        return true;
    }
    
    public int getRandom() {

        int randomIndex = random.nextInt(numList.size());
        return numList.get(randomIndex);
    }

    public static void main(String[] args) {

        RandomizedSet randomizedSet = new RandomizedSet();

        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.numList);
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.numList);
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.numList);
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.numList);
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.numList);
        //randomizedSet.getRandom();
    }
}
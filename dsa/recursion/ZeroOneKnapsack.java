package dsa.recursion;

public class ZeroOneKnapsack {


    public static void main(String[]args){

        Integer wt [] = {1,3,4,10};
        Integer pr [] = {1,4,5,7};

        Integer capacity = 10;

        System.out.println(knapsack(wt,pr,capacity,wt.length));
    }

    private static Integer knapsack(Integer[] wt, Integer[] pr, int capacity, int n) {

        if(n == 0 || capacity == 0){
            return 0;
        }else if(capacity < wt[n-1]){
            return knapsack(wt,pr,capacity,n-1);
        }else{
            return Math.max((pr[n-1] + knapsack(wt, pr , capacity - wt[n-1], n-1)) , (knapsack(wt,pr,capacity,n-1)));
        }
    }
}

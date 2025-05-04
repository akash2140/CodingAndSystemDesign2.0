package dsa.slidingwindows;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeNumberWindow {


    public static List<Integer> firstNegativeNumberWindow(int arr[], int k){

        int i=0, j= 0,n = arr.length;
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<Integer> negs = new LinkedList<>();

        while(j < n){

            if(arr[j] < 0){
                negs.add(arr[j]);
            }

            if(j - i + 1 < k){
                j++;
            }else if(j - i + 1 == k){

                if(!negs.isEmpty()) {
                    result.add(negs.getFirst());
                }else{
                    result.add(0);
                }

                if(arr[i] < 0 && negs.contains(arr[i])) {
                    negs.remove(Integer.valueOf(arr[i]));
                }

                i++;
                j++;
            }
        }

        return result;
    }
    public static void main(String[] args) {

//      int arr[] = {2,5,1,8,2,9,1};
        int arr[] = {12,-1,-7,8,-15,30,16,28};
        int k = 3;

        List<Integer> result = firstNegativeNumberWindow(arr,k);

        result.forEach( value -> System.out.println(value));
    }
}

package dsa.datastructures.stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterI {


    public static ArrayList<Integer> nextGreaterI(int[] arr){

        int n = arr.length;
        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = n-1 ; i>=0 ; i--){

            if(stack.isEmpty()){

                stack.push(arr[i]);
                result[i] = -1;
            }else {
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() > arr[i]){
                    result[i] = stack.peek();
                    stack.push(arr[i]);
                }else{
                    result[i] = -1;
                    stack.push(arr[i]);
                }
            }
        }

        for(int i = result.length - 1; i >=0 ; i--){
            list.add(result[i]);
        }

        return list;
    }
    public static void main(String[] args) {

//        int arr[] = {1,3,2,4};
//        int arr[] = {1,3,0,0,1,2,4};
        int arr[] = {6,8,0,1,3};
        ArrayList<Integer> result = nextGreaterI(arr);

        for(int i = 0; i< result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}

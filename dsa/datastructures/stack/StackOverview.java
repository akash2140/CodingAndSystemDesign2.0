package dsa.datastructures.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackOverview {

    public void threadSynhronisation(){

        List<Integer> list = new ArrayList<>();

        Runnable task = () ->{

            for(int i = 0; i<10; i++){
                list.add(i);

                if(!list.isEmpty()){
                    System.out.println(list.get(list.size() - 1));
                    list.remove(list.size() - 1);
                }
            }
        };


        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();

    }
}

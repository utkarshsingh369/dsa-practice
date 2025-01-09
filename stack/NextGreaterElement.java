package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
        // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> res =new ArrayList<>();
        Stack<Integer> stack =new Stack<>();
        int n =arr.length;
        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty()){
                res.add(-1);
            }else if(stack.peek() > arr[i]){
                res.add(stack.peek());
            }else{
                while(stack.peek()<=arr[i]){
                    stack.pop();
                    if(stack.isEmpty()){
                        res.add(-1);
                        break;
                    }
                }
                if(!stack.isEmpty()){
                    res.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}

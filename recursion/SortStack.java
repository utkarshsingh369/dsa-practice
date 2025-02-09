package recursion;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    private static void insertAtCorrectPosition(Stack<Integer> stack, int popped){
        if(stack.isEmpty()|| stack.peek()<=popped){
            stack.push(popped);
            return;
        }
        int temp= stack.pop();
        insertAtCorrectPosition(stack, popped);
        stack.push(temp);
    }
    private static void sortStack(Stack<Integer> stack){
        if(stack.size()==1){
            return;
        }
        int popped = stack.pop();
        sortStack(stack);
        insertAtCorrectPosition(stack, popped);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(17);
        stack.add(7);
        stack.add(37);
        stack.add(12);
        stack.add(27);
        stack.add(14);
        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);


    }
}

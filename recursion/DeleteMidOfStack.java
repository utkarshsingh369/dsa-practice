package recursion;

import java.util.Stack;

public class DeleteMidOfStack {
    private static void deleteMid(Stack<Integer> stack, int k){
        if(k==1){
            stack.pop();
            return;
        }
        int temp=stack.pop();
        deleteMid(stack, k-1);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(17);
        stack.add(7);
        stack.add(37);
        stack.add(12);
        stack.add(27);
        stack.add(14);
        stack.add(6);
        stack.push(55);

        deleteMid(stack,stack.size()/2);
        System.out.println(stack);
    }
}

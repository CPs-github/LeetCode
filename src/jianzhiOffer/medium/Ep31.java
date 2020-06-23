package jianzhiOffer.medium;

import java.util.Stack;

public class Ep31 {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] poped = {3,4,5,2,1};
        System.out.println(validateStackSequences(pushed,poped));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed){
            stack.add(num);
            while (!stack.isEmpty()&&stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}

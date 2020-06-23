package jianzhiOffer.simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Ex30 {
    public static void main(String[] args) {

    }
}
class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> nums ;
    public MinStack() {
        stack = new Stack<>();
        nums = new Stack<>();
    }

    public void push(int x) {
        if (nums.isEmpty() || x<=nums.peek()){
            nums.add(x);
        }
        stack.add(x);
    }

    public void pop() {
        if (stack.pop().equals(nums.peek())) {

        nums.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return nums.peek();
    }
}
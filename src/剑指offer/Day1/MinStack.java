package 剑指offer.Day1;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty()||minStack.peek()>=x){
            minStack.push(x);
        }
    }

    public void pop() {
        int val = stack.pop();
        if (!minStack.isEmpty()){
            if (minStack.peek()==val){
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
       return minStack.peek();

    }
}

/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

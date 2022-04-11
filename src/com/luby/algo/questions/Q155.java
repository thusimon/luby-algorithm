package com.luby.algo.questions;

import java.util.Stack;

public class Q155 {
  /**
   * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
   * Your MinStack object will be instantiated and called as such:
   * MinStack obj = new MinStack();
   * obj.push(val);
   * obj.pop();
   * int param_3 = obj.top();
   * int param_4 = obj.getMin();
   */
  public class MinStack {
    private Stack<Integer> valueStack;
    private Stack<Integer> minStack;
    public MinStack() {
      valueStack = new Stack<>();
      minStack = new Stack<>();
    }

    public void push(int val) {
      valueStack.push(val);
      if (minStack.isEmpty() || val <= minStack.peek()) {
        minStack.push(val);
      }
    }

    public void pop() {
      int value = valueStack.pop();
      if (value <= minStack.peek()) {
        minStack.pop();
      }
    }

    public int top() {
      return valueStack.peek();
    }

    public int getMin() {
      return minStack.peek();
    }
  }

  public static void main(String[] args) {
    MinStack minStack = new Q155().new MinStack();
    minStack.push(0);
    minStack.push(1);
    minStack.push(0);
    System.out.println(minStack.getMin()); // return -3
    minStack.pop();
    System.out.println(minStack.top());    // return 0
    System.out.println(minStack.getMin()); // return -2
  }
}

package com.luby.algo.questions;

import java.util.Stack;

public class Q20 {
  public class Solution {
    public boolean isValid(String s) {
      if (s == null || s.length() == 0) {
        return true;
      }
      Stack<Character> parenthesesStack = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '(' || c == '{' || c == '[') {
          parenthesesStack.push(c);
        }
        if (c == ')') {
          if (parenthesesStack.size() > 0 && parenthesesStack.peek() == '(') {
            parenthesesStack.pop();
          } else {
            return false;
          }
        }
        if (c == '}') {
          if (parenthesesStack.size() > 0 && parenthesesStack.peek() == '{') {
            parenthesesStack.pop();
          } else {
            return false;
          }
        }
        if (c == ']') {
          if (parenthesesStack.size() > 0 && parenthesesStack.peek() == '[') {
            parenthesesStack.pop();
          } else {
            return false;
          }
        }
      }
      return parenthesesStack.size() == 0;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q20().new Solution();
    String test1 = "()";
    String test2 = "()[]{}";
    String test3 = "(]";
    System.out.println(s.isValid(test1));
    System.out.println(s.isValid(test2));
    System.out.println(s.isValid(test3));
  }
}

package com.luby.algo.questions;

import java.util.Arrays;

public class Q344 {
  class Solution {
    /**
     * Write a function that reverses a string.
     * The input string is given as an array of characters s.
     * Input: s = ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     * @param s
     */
    public void reverseString(char[] s) {
      if (s == null || s.length < 2) {
        return;
      }
      for (int i = 0; i < s.length / 2; i++) {
        char temp = s[s.length - 1 - i];
        s[s.length - 1 - i] = s[i];
        s[i] = temp;
      }
    }
  }
  public static void main(String[] args) {
    Solution s = new Q344().new Solution();
    char[] c1 = new char[] {'h', 'e', 'l', 'l', 'o'};
    s.reverseString(c1);
    System.out.println(Arrays.toString(c1));
  }
}

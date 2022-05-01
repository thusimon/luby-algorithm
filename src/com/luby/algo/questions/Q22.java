package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q22 {
  /**
   * Given n pairs of parentheses,
   * write a function to generate all combinations of well-formed parentheses.
   * Input: n = 3
   * Output: ["((()))","(()())","(())()","()(())","()()()"]
   */
  class Solution {
    public List<String> generateParenthesis(int n) {
      List plist = new ArrayList();
      generateParenthesis(n, 0, 0, "", plist);
      return plist;
    }

    public void generateParenthesis(int n, int start, int end, String current, List<String> plist) {
      if (start > n || end > n) {
        return;
      }
      if (start == n && end == n) {
        plist.add(current);
      } else {
        if (start < n) {
          generateParenthesis(n, start + 1, end, current + "(", plist);
        }
        if (end < start) {
          generateParenthesis(n, start, end + 1, current + ")", plist);
        }
      }
    }
  }

  public static void main(String[] args) {
    Solution s = new Q22().new Solution();
    System.out.println(s.generateParenthesis(1));
    System.out.println(s.generateParenthesis(2));
    System.out.println(s.generateParenthesis(3));
  }
}

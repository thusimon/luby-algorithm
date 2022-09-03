package com.luby.algo.questions;

public class Q38 {
  class Solution {
    public String countAndSay(int n) {
      if (n == 1) {
        return "1";
      }
      // say n-1
      String sayResult = countAndSay(n - 1);
      String currStr = String.valueOf(sayResult.charAt(0));
      int currStrCount = 0;
      String result = "";
      for (int i = 0; i < sayResult.length(); i++) {
        String is = String.valueOf(sayResult.charAt(i));
        if (is.equals(currStr)) {
          currStrCount ++;
        } else {
          result += currStrCount + currStr;
          currStr = is;
          currStrCount = 1;
        }
      };

      if (currStrCount != 0) {
        result += currStrCount + currStr;
      }
      return result;
    }
  }

  public static void main(String[] args) {
    Q38.Solution solution = new Q38().new Solution();
    System.out.println(solution.countAndSay(1));
    System.out.println(solution.countAndSay(2));
    System.out.println(solution.countAndSay(3));
    System.out.println(solution.countAndSay(4));
    System.out.println(solution.countAndSay(5));
  }
}

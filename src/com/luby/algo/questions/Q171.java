package com.luby.algo.questions;

public class Q171 {
  class Solution {
    /**
     * Given a string columnTitle that represents the column title as appear in an Excel sheet
     * return its corresponding column number.
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * @param columnTitle
     * @return
     */
    public int titleToNumber(String columnTitle) {
      if (columnTitle == null || columnTitle.length() == 0) {
        return 0;
      }
      int sum = 0;
      for (int i = 0; i < columnTitle.length(); i++) {
        int c = columnTitle.charAt(i) - 'A' + 1;
        sum += c * Math.pow(26, columnTitle.length() - i - 1);
      }
      return sum;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q171().new Solution();
    System.out.println(s.titleToNumber("A"));
    System.out.println(s.titleToNumber("AB"));
    System.out.println(s.titleToNumber("ZY"));
  }
}

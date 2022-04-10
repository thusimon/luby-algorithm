package com.luby.algo.questions;

import java.util.Locale;

public class Q125 {
  class Solution {
    /**
     * remove the non-alphanumeric characters
     * reads the same forward and backward
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
      if (s == null) {
        return true;
      }
      s = s.toLowerCase();
      s = s.replaceAll("[^a-z0-9]", "");
      int lowIdx = 0;
      int highIdx = s.length() - 1;
      while (lowIdx < highIdx) {
        if (s.charAt(lowIdx) != s.charAt(highIdx)) {
          return false;
        }
        lowIdx++;
        highIdx--;
      }
      return true;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q125().new Solution();
    String test1 = "A man, a plan, a canal: Panama";
    String test2 = "race a car";
    String test3 = " ";
    System.out.println(s.isPalindrome(test1));
    System.out.println(s.isPalindrome(test2));
    System.out.println(s.isPalindrome(test3));
  }
}

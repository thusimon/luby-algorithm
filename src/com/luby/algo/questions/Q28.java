package com.luby.algo.questions;

public class Q28 {
  public class Solution {
    /**
     * find index of needle in haystack
     * if needle is empty string return 0
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
      if ("".equals(needle)) {
        return 0;
      }
      int needleLen = needle.length();
      if ("".equals(haystack)) {
        return -1;
      }
      int len = haystack.length() - needleLen;
      for (int i = 0; i <= len; i++) {
        boolean found = true;
        for (int j = 0; j < needleLen; j++) {
          if (haystack.charAt(i + j) != needle.charAt(j)) {
            found = false;
            break;
          }
        }
        if (found) {
          return i;
        }
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q28().new Solution();
    String h1 = "hello"; String n1 = "ll";
    String h2 = "aaaaa"; String n2 = "bba";
    System.out.println(s.strStr(h1, n1));
    System.out.println(s.strStr(h2, n2));
  }
}

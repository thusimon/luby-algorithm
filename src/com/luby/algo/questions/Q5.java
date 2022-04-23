package com.luby.algo.questions;

public class Q5 {
  class Solution {
    /**
     * Given a string s, return the longest palindromic substring in s
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
      if (s == null || s.length() < 2) {
        return s;
      }
      int len = s.length();
      boolean[][] dp = new boolean[len][len];

      int maxLen = 1;
      String palindromic = s.substring(0, 1);

      // initialize db
      // dp[i][i] = true
      // dp[i][i+1] = true if s[i] == s[i+1]
      for (int i = 0; i < len - 1; i++) {
        dp[i][i] = true;
        if (s.charAt(i) == s.charAt(i+1)) {
          maxLen = 2;
          palindromic = s.substring(i, i + 2);
          dp[i][i + 1] = true;
        }
      }
      dp[len - 1][len - 1] = true;

      /**
       * if s[i+1]~s[j-1] is palindromic AND s[i] == s[j], then s[i]~s[j] is palindromic
       * in the dp[][] table, i is row, j is column
       */
      for (int i = len - 1; i >= 0; i--) {
        for (int j = i + 1; j < len; j++) {
          if (s.charAt(i) == s.charAt(j)) {
            if (dp[i + 1][j - 1]) {
              dp[i][j] = true;
              int foundLen = j - i + 1;
              if (maxLen < foundLen) {
                maxLen = foundLen;
                palindromic = s.substring(i, j + 1);
              }
            }
          }
        }
      }
      return palindromic;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q5().new Solution();
    System.out.println(s.longestPalindrome("a"));
    System.out.println(s.longestPalindrome("ab"));
    System.out.println(s.longestPalindrome("aaaaa"));
    System.out.println(s.longestPalindrome("babad"));
    System.out.println(s.longestPalindrome("cbbd"));
  }
}

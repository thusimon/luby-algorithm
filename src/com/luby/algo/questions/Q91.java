package com.luby.algo.questions;

public class Q91 {
  class Solution {
    /**
     * A message containing letters from A-Z can be encoded into numbers using the following mapping:
     * 'A' -> "1"
     * 'B' -> "2"
     * ...
     * 'Z' -> "26"
     * To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
     * "AAJF" with the grouping (1 1 10 6)
     * "KJF" with the grouping (11 10 6)
     * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
     *
     * Given a string s containing only digits, return the number of ways to decode it.
     * @param s
     * @return numDecodings
     */
    public int numDecodings(String s) {
      if (s == null || s.length() == 0) {
        return 0;
      }
      int len = s.length();
      int[] dp = new int[len + 1];
      dp[0] = 1;
      dp[1] = s.charAt(0) == '0' ? 0 : 1;
      for(int i = 2; i <= len; i++) {
        int firstV = Integer.parseInt(s.substring(i - 1, i));
        int secondV = Integer.parseInt(s.substring(i - 2, i));
        if (firstV >=1 && firstV <= 9) {
          dp[i] += dp[i - 1];
        }
        if (secondV >= 10 && secondV <= 26) {
          dp[i] += dp[i - 2];
        }
      }
      return dp[len];
    }

    public int numDecodingsV2(String s) {
      int len = s.length();
      if (len == 0) {
        return 0;
      }
      if (len == 1) {
        int parsed = Integer.parseInt(s);
        return parsed <= 9 && parsed >= 1 ? 1 : 0;
      }
      if (len == 2) {
        int parsed = Integer.parseInt(s);
        int res = 0;
        res += parsed <= 26 && parsed >= 10 ? 1 : 0;
        int parsed1 = Integer.parseInt(s.substring(0,1));
        int parsed2 = Integer.parseInt(s.substring(1,2));
        res += parsed1 <= 9 && parsed1 >= 1 && parsed2 <= 9 && parsed2 >= 1 ? 1 : 0;
        return res;
      }
      // len > 2
      String sub1 = s.substring(0, 1);
      String sub1_left = s.substring(1);
      String sub2 = s.substring(0, 2);
      String sub2_left = s.substring(2);
      int t1 = numDecodingsV2(sub1) > 0 ? numDecodingsV2(sub1_left) : 0;
      int t2 = numDecodingsV2(sub2) > 0 ? numDecodingsV2(sub2_left) : 0;
      return t1 + t2;
    }
  }

  public static void main(String[] args) {
    Q91.Solution s = new Q91().new Solution();
    System.out.println(s.numDecodings("11106"));
    System.out.println(s.numDecodingsV2("11106"));
    System.out.println(s.numDecodings("226"));
    System.out.println(s.numDecodingsV2("226"));
    System.out.println(s.numDecodings("1231234"));
    System.out.println(s.numDecodingsV2("1231234"));
  }
}

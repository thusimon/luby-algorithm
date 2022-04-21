package com.luby.algo.questions;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
  class Solution {
    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
      if (s == null || s.length() < 1) {
        return 0;
      }
      Map<String, Integer> occurMap = new HashMap();
      int startIdx = 0;
      int len = 0;
      for (int i = 0; i < s.length(); i++) {
        String si = s.substring(i, i + 1);
        if (occurMap.containsKey(si)) {
          // need to update startIdx
          startIdx = Math.max(startIdx, occurMap.get(si) + 1);
        }
        occurMap.put(si, i);
        len = Math.max(len, i - startIdx + 1);
      }
      return len;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q3().new Solution();
    System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    System.out.println(s.lengthOfLongestSubstring("bbbbb"));
    System.out.println(s.lengthOfLongestSubstring("pwwkewd"));
    System.out.println(s.lengthOfLongestSubstring("ohomm"));
    System.out.println(s.lengthOfLongestSubstring("abba"));
  }
}

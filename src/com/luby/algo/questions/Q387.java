package com.luby.algo.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q387 {
  class Solution {
    /**
     * Given a string s, find the first non-repeating character in it
     * and return its index. If it does not exist, return -1.
     * Input: s = "leetcode"; Output: 0
     * Input: s = "loveleetcode"; Output: 2
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
      Map<String, Integer> occurMap = new LinkedHashMap<>();
      for (int i = 0; i < s.length(); i++) {
        String si = s.substring(i, i + 1);
        if (occurMap.containsKey(si)) {
          if (occurMap.get(si) > -1) {
            occurMap.put(si, -1);
          }
        } else {
          occurMap.put(si, i);
        }
      }
      for (Integer idx : occurMap.values()) {
        if (idx > -1) {
          return idx;
        }
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q387().new Solution();
    System.out.println(s.firstUniqChar("leetcode"));
    System.out.println(s.firstUniqChar("loveleetcode"));
    System.out.println(s.firstUniqChar("aabb"));
  }
}

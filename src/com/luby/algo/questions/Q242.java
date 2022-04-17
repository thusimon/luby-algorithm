package com.luby.algo.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q242 {
  class Solution {
    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase
     * typically using all the original letters exactly once.
     * e.g Input: s = "anagram", t = "nagaram"; Output: true
     * Input: s = "rat", t = "car"; Output: false
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) {
        return false;
      }
      Map<String, Integer> occuranceMap = new HashMap<>();
      for (int i = 0; i < s.length(); i++) {
        String si = s.substring(i, i + 1);
        String ti = t.substring(i, i + 1);
        if (occuranceMap.containsKey(si)) {
          occuranceMap.put(si, occuranceMap.get(si) + 1);
        } else {
          occuranceMap.put(si, 1);
        }
        if (occuranceMap.containsKey(ti)) {
          occuranceMap.put(ti, occuranceMap.get(ti) - 1);
        } else {
          occuranceMap.put(ti, -1);
        }
      }
      for (Integer count : occuranceMap.values()) {
        if (count != 0) {
          return false;
        }
      }
      return true;
    }

    public boolean isAnagramArr(String s, String t) {
      int[] s1 = new int[26];
      int[] t1 = new int[26];
      for (char ch : s.toCharArray()) {
        s1[ch - 'a']++;
      }
      for (char ch : t.toCharArray()) {
        t1[ch - 'a']++;
      }
      return Arrays.equals(s1, t1);
    }
  }

  public static void main(String[] args) {
    Solution s = new Q242().new Solution();
    System.out.println(s.isAnagram("a", "a"));
    System.out.println(s.isAnagram("anagram", "nagaram"));
    System.out.println(s.isAnagram("rat", "car"));
  }
}

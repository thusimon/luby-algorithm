package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q49 {
  class Solution {
    /**
     * Given an array of strings strs, group the anagrams together.
     * You can return the answer in any order.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     * e.g
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     *
     * a->0, z->25
     */

    private String computeKey(String s) {
      int[] charBits = new int[26];
      int a = 'a';
      for(byte c : s.getBytes()) {
        int cIdx = c - a;
        charBits[cIdx]++;
      }
      return Arrays.stream(charBits).mapToObj(String::valueOf).collect(Collectors.joining(","));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();
      for(String s : strs) {
        String sKey = computeKey(s);
        List<String> val = map.get(sKey);
        if (val == null) {
          val = new ArrayList<>();
          map.put(sKey, val);
        }
        val.add(s);
      }
      return map.values().stream().toList();
    }
  }

  public static void main(String[] args) {
    Q49.Solution solution = new Q49().new Solution();
    System.out.println(solution.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    System.out.println(solution.groupAnagrams(new String[] {""}));
    System.out.println(solution.groupAnagrams(new String[] {"a"}));
  }
}

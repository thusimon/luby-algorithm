package com.luby.algo.questions;

import java.util.HashMap;
import java.util.Map;

public class Q13 {
  public static class Solution {
    public static final Map<String, Integer> RomanToIntMap = Map.of(
      "I",1,
      "V",5,
      "X",10,
      "L",50,
      "C",100,
      "D",500,
      "M",1000
    );

    public int romanToInt(String s) {
      int result = 0;
      int temp = 0;
      String prev = s.charAt(0) + "";
      for(int i = 0; i < s.length(); i++) {
        String si = s.charAt(i) + "";
        int v = RomanToIntMap.get(si);
        int vprev = RomanToIntMap.get(prev);
        if (v > vprev) {
          result += v - temp;
          temp = 0;
        } else if (v == vprev) {
          temp += v;
        } else {
          result += temp;
          temp = v;
        }
        prev = si;
      }
      result += temp;
      return result;
    }
  }
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.romanToInt("I"));
    System.out.println(s.romanToInt("IV"));
    System.out.println(s.romanToInt("V"));
    System.out.println(s.romanToInt("VII"));
    System.out.println(s.romanToInt("VIII"));
    System.out.println(s.romanToInt("IX"));
    System.out.println(s.romanToInt("XXVII"));
    System.out.println(s.romanToInt("LVIII"));
    System.out.println(s.romanToInt("MCMXCIV"));
  }
}

package com.luby.algo.questions;

public class Q8 {
  class Solution {
    /**
     * Implement the myAtoi(string s) function,
     * which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
     * @param s
     * @return
     */
    public int myAtoi(String s) {
      final int len = s.length();

      if(len == 0){
        return 0;
      }

      int index = 0;
      while(index < len && s.charAt(index) == ' '){
        index++;
      }

      if(index == len){
        return 0;
      }

      char ch;
      boolean isNegative = (ch = s.charAt(index)) ==  '-';

      if(isNegative || ch == '+'){
        ++index;
      }

      final int maxLimit = Integer.MAX_VALUE / 10;
      int result = 0;
      while(index < len && (s.charAt(index) <= '9' && s.charAt(index) >= '0')){

        int digit = s.charAt(index) - '0';

        if(result > maxLimit || (result == maxLimit && digit > 7)){
          return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        result = (result * 10) + digit;

        ++index;
      }

      return isNegative ? -result : result;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q8().new Solution();
    System.out.println(s.myAtoi("42"));
    System.out.println(s.myAtoi("   -42"));
    System.out.println(s.myAtoi("4193 with words"));
  }
}

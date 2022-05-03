package com.luby.algo.questions;

public class Q29 {
  class Solution {
    /**
     * Given two integers dividend and divisor,
     * divide two integers without using multiplication, division, and mod operator.
     * e.g: Input: dividend = 10, divisor = 3
     * Output: 3
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {
      if (dividend == 0) {
        return 0;
      }
      if (dividend == 1 << 31 && divisor == -1) {
        return Integer.MAX_VALUE;
      }
      boolean sign = (dividend >= 0) == (divisor >= 0);
      dividend = Math.abs(dividend);
      divisor = Math.abs(divisor);
      int result = 0;
      while (dividend - divisor >= 0) {
        int shiftCount = 0;
        while (dividend - (divisor << 1 << shiftCount) >= 0) {
          shiftCount++;
        }
        result += 1 << shiftCount;
        dividend -= divisor << shiftCount;
      }
      return sign ? result : -result;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q29().new Solution();
//    System.out.println(s.divide(10, 3));
//    System.out.println(s.divide(-7, 3));
//    System.out.println(s.divide(-12, 4));
//    System.out.println(s.divide(20, -1));
    System.out.println(s.divide(49, 3));
  }
}

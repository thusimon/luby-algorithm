package com.luby.algo.questions;

public class Q7 {
  class Solution {
    /**
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * e.g.
     * Input: x = 120, Output: 21
     * Input: x = -123, Output: -321
     * @param x
     * @return
     */
    public int reverse(int x) {
      int reverseX = 0;
      int signMultiplier = 1;
      if (x < 0) {
        signMultiplier = -1;
        x = signMultiplier * x;
      }

      while (x != 0) {
        if (reverseX * signMultiplier > Integer.MAX_VALUE / 10 || reverseX * signMultiplier < Integer.MIN_VALUE / 10) {
          return 0;
        }
        int remain = x % 10;
        reverseX = reverseX * 10 + remain;
        x /= 10;
      }
      return reverseX * signMultiplier;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q7().new Solution();
    System.out.println(s.reverse(0));
    System.out.println(s.reverse(123));
    System.out.println(s.reverse(120));
    System.out.println(s.reverse(-123));
    System.out.println(s.reverse(1534236469));
    System.out.println(s.reverse(-2147483648));
  }
}

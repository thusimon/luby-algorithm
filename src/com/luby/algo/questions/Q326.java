package com.luby.algo.questions;

public class Q326 {
  class Solution {
    /**
     * Given an integer n, return true if it is a power of three. Otherwise, return false.
     * e.g 27 true, 8 false
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
      if (n == 0 || n == 2) {
        return false;
      }
      if (n == 1) {
        return true;
      }
      do {
        int remainder = n % 3;
        if (remainder != 0) {
          return false;
        }
        n /= 3;
      } while (n != 1);
      return true;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q326().new Solution();
    System.out.println(s.isPowerOfThree(0));
    System.out.println(s.isPowerOfThree(6));
    System.out.println(s.isPowerOfThree(8));
    System.out.println(s.isPowerOfThree(12));
    System.out.println(s.isPowerOfThree(24));
    System.out.println(s.isPowerOfThree(1));
    System.out.println(s.isPowerOfThree(3));
    System.out.println(s.isPowerOfThree(9));
    System.out.println(s.isPowerOfThree(27));
  }
}

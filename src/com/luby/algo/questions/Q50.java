package com.luby.algo.questions;

public class Q50 {
  class Solution {
    /**
     * Implement pow(x, n), which calculates x raised to the power n
     * n is an integer.
     * -10^4 <= x^n <= 10^4
     */
    public double myPow1(double x, int n) {
      if (n == 0) {
        return 1;
      }
      if (n < 0) {
        n = -n;
        x = 1 / x;
      }
      if (n % 2 == 1) {
        return x * myPow1(x, n-1);
      } else {
        return myPow1(x*x, n/2);
      }
    }
    public double myPow(double x, int n) {
      if (n < 0) {
        n = -n;
        x = 1 / x;
      }
      double pow = 1;
      while(n != 0) {
        if (n % 2 == 1) {
          pow *= x;
        }
        x *= x;
        n >>>= 1;
      }
      return pow;
    }
  }

  public static void main(String[] args) {
    Q50.Solution solution = new Q50().new Solution();
      System.out.println(solution.myPow(2, 10));
      System.out.println(solution.myPow(2, -10));
      System.out.println(solution.myPow(2, 1));
      System.out.println(solution.myPow(2, -1));
      System.out.println(solution.myPow(2, -2147483648));
  }
}

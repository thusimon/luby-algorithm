package com.luby.algo.questions;

public class Q69 {
  public class Solution {
    /**
     * find the sqrt of x = 15
     * 1 15 -> mid = 8
     * 1 8 -> mid = 4
     * 1 4 -> mid = 2
     * 2 4 -> mid = 3
     * 3 4 -> mid = 3
     * @param x
     * @return
     */
    public int mySqrt(int x) {
      if (x == 0) {
        return 0;
      }
      if (x < 4) {
        return 1;
      }
      // divide and conquer
      int low = 0;
      int high = x;
      while (low <= high) {
        int mid = (low + high) / 2;
        if (mid > x / mid) {
          high = mid - 1;
        } else if (mid < x / mid) {
          low = mid + 1;
        } else {
          return mid;
        }
      }
      return (low + high) / 2;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q69().new Solution();
    System.out.println(s.mySqrt(4));
    System.out.println(s.mySqrt(7));
    System.out.println(s.mySqrt(8));
    System.out.println(s.mySqrt(9));
    System.out.println(s.mySqrt(15));
    System.out.println(s.mySqrt(2147395599));
  }
}

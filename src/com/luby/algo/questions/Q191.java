package com.luby.algo.questions;

public class Q191 {
  public class Solution {
    /**
     * Write a function that takes an unsigned integer
     * returns the number of '1' bits it has
     * you need to treat n as an unsigned value
     * e,g Input: n = 00000000000000000000000000001011
     * Output: 3
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
      int result = 0;
      for (int i = 0; i < 32; i++) {
        int bitIs1 = (n & 1) > 0 ? 1 : 0;
        result += bitIs1;
        n = n >> 1;
      }
      return result;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q191().new Solution();
    System.out.println(s.hammingWeight(0));
    System.out.println(s.hammingWeight(0b00000000000000000000000000001011));
    System.out.println(s.hammingWeight(0b00000000000000000000000010000000));
    System.out.println(s.hammingWeight(0b11111111111111111111111111111101));
  }
}

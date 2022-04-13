package com.luby.algo.questions;

public class Q190 {
  public class Solution {
    /**
     * Reverse bits of a given 32 bits unsigned integer
     * Input:  n = 00000010100101000001111010011100
     * Output: 964176192 (00111001011110000010100101000000)
     * you need treat n as an unsigned value
     * @param n
     * @return
     */
    public int reverseBits(int n) {
      int res = 1;
      for(int i = 0; i < 32; i++, n >>= 1) {
        res = (res << 1) + (n & 1);
      }
      return res;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q190().new Solution();
    int num1 = 0b00000010100101000001111010011100;
    int num2 = 0b11111111111111111111111111111101;
    int num3 = 0b10010110111001001101001111110101;
    int reverse;
    reverse = s.reverseBits(num1);
    System.out.println(reverse + ": " + Integer.toBinaryString(reverse));
    reverse = s.reverseBits(num2);
    System.out.println(reverse + ": " + Integer.toBinaryString(reverse));
    reverse = s.reverseBits(num3);
    System.out.println(reverse + ": " + Integer.toBinaryString(reverse));
  }
}

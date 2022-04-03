package com.luby.algo.questions;

import java.util.Arrays;

public class Q66 {
  public class Solution {
    public int[] plusOne(int[] digits) {
      if (digits == null || digits.length == 0) {
        return digits;
      }
      int overflow = 1;
      for (int i = digits.length - 1; i >= 0; i--) {
        int added = digits[i] + overflow;
        if (added > 9) {
          overflow = 1;
          added = 0;
        } else {
          overflow = 0;
        }
        digits[i] = added;
      }
      if (overflow > 0) {
        // need to add the most significant digit as 1
        int[] digistsMoreLen = new int[digits.length + 1];
        System.arraycopy(digits, 0, digistsMoreLen, 1, digits.length);
        digistsMoreLen[0] = 1;
        return digistsMoreLen;
      } else {
        return digits;
      }
    }
  }
  public static void main(String[] args) {
    Solution s = new Q66().new Solution();
    int[] digits1 = new int[] {1, 2, 3};
    int[] digits2 = new int[] {4, 3, 2, 1};
    int[] digits3 = new int[] {9};
    System.out.println(Arrays.toString(s.plusOne(digits1)));
    System.out.println(Arrays.toString(s.plusOne(digits2)));
    System.out.println(Arrays.toString(s.plusOne(digits3)));
  }
}

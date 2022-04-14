package com.luby.algo.questions;

import java.util.Set;
import java.util.HashSet;

public class Q202 {
  class Solution {
    /**
     * A happy number is a number defined by the following process:
     * 1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
     * 2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
     * 3. Those numbers for which this process ends in 1 are happy.
     * e.g n = 19
     * 1^2 + 9^2 = 82
     * 8^2 + 2^2 = 68
     * 6^2 + 8^2 = 100
     * 1^2 + 0^2 + 0^2 = 1
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
      int nTemp = n;
      int sum = 0;
      Set<Integer> memory = new HashSet<>();
      memory.add(1);
      do {
        if (memory.contains(nTemp)) {
          break;
        } else {
          memory.add(nTemp);
        }
        sum = 0;
        while (nTemp > 0) {
          int digit = nTemp % 10;
          sum += digit * digit;
          nTemp /= 10;
        }
        nTemp = sum;
      } while (true);
      return nTemp == 1;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q202().new Solution();
    System.out.println(s.isHappy(1));
    System.out.println(s.isHappy(19));
    System.out.println(s.isHappy(2));
  }
}

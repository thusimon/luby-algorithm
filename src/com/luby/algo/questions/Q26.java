package com.luby.algo.questions;

import java.util.Arrays;

public class Q26 {
  public class Solution {
    /**
     * {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
     * {0, 1, 0, 1, 1, 2, 2, 3, 3, 4}
     * {0, 1, 2, 1, 1, 0, 2, 3, 3, 4}
     * {0, 1, 2, 3, 1, 0, 2, 1, 3, 4}
     * {0, 1, 2, 3, 4, 0, 2, 1, 3, 1};
     */
    public int removeDuplicates(int[] nums) {
      if (nums == null || nums.length < 1) {
        return 0;
      }
      if (nums.length == 1) {
        return 1;
      }
      int count = 0;
      for (int i = 1; i < nums.length; i++) {
        int cur = nums[i];
        int curMax = nums[count];
        if (cur > curMax) {
          count++;
          // swap cur and num[count]
          int temp = nums[count];
          nums[count] = cur;
          nums[i] = temp;
        }
      }
      return count + 1;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q26().new Solution();
    int[] a1 = new int[] {};
    int[] a2 = new int[] {1};
    int[] a3 = new int[] {1, 1, 2};
    int[] a4 = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.print(s.removeDuplicates(a1));
    System.out.println(Arrays.toString(a1));
    System.out.print(s.removeDuplicates(a2));
    System.out.println(Arrays.toString(a2));
    System.out.print(s.removeDuplicates(a3));
    System.out.println(Arrays.toString(a3));
    System.out.print(s.removeDuplicates(a4));
    System.out.println(Arrays.toString(a4));
  }
}

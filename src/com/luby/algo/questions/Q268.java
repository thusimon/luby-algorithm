package com.luby.algo.questions;

public class Q268 {
  class Solution {
    /**
     * Given an array nums containing n distinct numbers in the range [0, n]
     * return the only number in the range that is missing from the array.
     * e.g Input: nums = [3,0,1]; Output: 2
     * Input: nums = [0,1]; Output: 2
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
      int len = nums.length;
      // expect [0, len]
      int remainingSum = len *  (len + 1) / 2;
      for (int i = 0; i < len; i++) {
        remainingSum -= nums[i];
      }
      return remainingSum;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q268().new Solution();
    System.out.println(s.missingNumber(new int[] {3, 0, 1}));
    System.out.println(s.missingNumber(new int[] {0, 1}));
    System.out.println(s.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }
}

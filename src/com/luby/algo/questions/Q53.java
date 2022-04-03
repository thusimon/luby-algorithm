package com.luby.algo.questions;

public class Q53 {
  public class Solution {
    /**
     * find the sub array that has the maximum sum
     * [-2, 1, -3, 4, -1, 2, 1, -5, 4] = sum(4, -1, 2, 1) = 6
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
      if (nums == null || nums.length == 0) {
        return 0;
      }
      int sum = 0;
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        maxSum = Math.max(sum, maxSum);
        if (sum < 0) {
          sum = 0;
        }
      }
      return maxSum;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q53().new Solution();
    int[] a1 = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int[] a2 = new int[] {1};
    System.out.println(s.maxSubArray(a1));
    System.out.println(s.maxSubArray(a2));
  }
}

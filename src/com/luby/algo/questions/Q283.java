package com.luby.algo.questions;

import java.util.Arrays;

public class Q283 {
  class Solution {
    /**
     * Given an integer array nums
     * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Input: nums = [0,1,0,3,12]; Output: [1,3,12,0,0]
     * @param nums
     */
    public void moveZeroes(int[] nums) {
      /**
       * 0 1 0 3 12, idx = 0, zeroIdx = 0
       * 1 0 0 3 12, idx = 1, zeroIdx = 1
       * 1 0 0 3 12, idx = 2, zeroIdx = 1
       * 1 3 0 0 12, idx = 3, zeroIdx = 2
       * 1 3 12 0 0, idx = 4, zeroIdx = 3
       */
      if (nums == null || nums.length < 2) {
        return;
      }
      int zeroIdx = 0;
      for (int idx = 0; idx < nums.length; idx++) {
        if (nums[idx] != 0) {
          // swap num and zeroIdx
          int temp = nums[zeroIdx];
          nums[zeroIdx] = nums[idx];
          nums[idx] = temp;
          zeroIdx++;
        }
      }
    }
  }

  public static void main(String[] args) {
    Solution s = new Q283().new Solution();
    int[] nums1 = new int[] {0, 1, 0, 3, 12};
    int[] nums2 = new int[] {0};
    int[] nums3 = new int[] {1};
    int[] nums4 = new int[] {2, 1};
    int[] nums5 = new int[] {1, 0};
    s.moveZeroes(nums1);
    s.moveZeroes(nums2);
    s.moveZeroes(nums3);
    s.moveZeroes(nums4);
    s.moveZeroes(nums5);
    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums2));
    System.out.println(Arrays.toString(nums3));
    System.out.println(Arrays.toString(nums4));
    System.out.println(Arrays.toString(nums5));
  }
}

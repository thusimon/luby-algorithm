package com.luby.algo.questions;

import java.util.Arrays;

public class Q75 {
  class Solution {
    /**
     * Given an array nums with n objects colored red, white, or blue,
     * sort them in-place so that objects of the same color are adjacent,
     * with the colors in the order red, white, and blue.
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     * e.g.
     * Input: nums = [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     * You must solve this problem without using the library's sort function.
     * @param nums
     */
    public void sortColors(int[] nums) {
      int redCount = 0;
      int whiteCount = 0;
      int blueCount = 0;
      for(int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
          redCount++;
        } else if (nums[i] == 1) {
          whiteCount++;
        } else {
          blueCount++;
        }
      }
      for(int i = 0; i < redCount; i++) {
        nums[i] = 0;
      }
      for(int i = redCount; i < redCount + whiteCount; i++) {
        nums[i] = 1;
      }
      for(int i = redCount + whiteCount; i < redCount + whiteCount + blueCount; i++) {
        nums[i] = 2;
      }
    }
  }
  public static void main(String[] args) {
    Q75.Solution s = new Q75().new Solution();
    int[] nums = new int[]{2, 0, 2, 1, 1, 0};
    s.sortColors(nums);
    System.out.printf(Arrays.toString(nums));
    nums = new int[]{2, 0, 1};
    s.sortColors(nums);
    System.out.printf(Arrays.toString(nums));
  }
}

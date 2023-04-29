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
     */

    /**
     * count sort, when unique number is small, we can use this approach.
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

    /**
     * snowball sort, this approach will move all 2 to the right hand side
     * then move all 1 to the middle
     * the idea is, if we encounter n 2, then while i increase to num.length - 1, num[i-n] should be set to 2
     * this can guarantee that after i reaches to num.length - 1, all the num[length - n] to num[length - 1] are all 2
     * @param nums
     */
    public void sortColorsSnowball(int[] nums) {
      int count2 = 0;
      for(int i = 0; i < nums.length; i++) {
        if (nums[i] == 2) {
          count2++;
        } else {
          if (count2 > 0) {
            nums[i - count2] = nums[i];
            nums[i] = 2;
          }
        }
      }

      int count1 = 0;
      for(int i = 0; i < nums.length - count2; i++) {
        if(nums[i] == 1) {
          count1++;
        } else {
          if (count1 > 0) {
            nums[i - count1] = nums[i];
            nums[i] = 1;
          }
        }
      }
    }
  }
  public static void main(String[] args) {
    Q75.Solution s = new Q75().new Solution();
    int[] nums = new int[]{2, 0, 2, 1, 1, 0};
    //s.sortColors(nums);
    s.sortColorsSnowball(nums);
    System.out.println(Arrays.toString(nums));
    nums = new int[]{2, 0, 1};
    //s.sortColors(nums);
    s.sortColorsSnowball(nums);
    System.out.println(Arrays.toString(nums));
  }
}

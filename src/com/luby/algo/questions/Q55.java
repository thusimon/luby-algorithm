package com.luby.algo.questions;

import java.util.HashMap;
import java.util.Map;

public class Q55 {
  class Solution {
    /**
     * You are given an integer array nums.
     * You are initially positioned at the array's first index,
     * and each element in the array represents your maximum jump length at that position.
     * Return true if you can reach the last index, or false otherwise. e.g
     * Input: nums = [2,3,1,1,4]
     * Output: true
     * Input: nums = [3,2,1,0,4]
     * Output: false
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
      int len = nums.length;
      if (len <= 1) return true;
      boolean[] steps = new boolean[len];
      steps[0] = true;

      for(int i = 0; i < len; i++) {
        if (steps[i]) {
          int jumpSteps = nums[i];
          for(int j = 1; j <= jumpSteps; j++) {
            if (i + j < len) {
              steps[i + j] = true;
            }
          }
        }
      }
      return steps[len - 1];
    }
  }

  public static void main(String[] args) {
    Q55.Solution s = new Q55().new Solution();
    int[] nums = new int[] {2,3,1,1,4};
    System.out.println(s.canJump(nums));
    nums = new int[] {3,2,1,0,4};
    System.out.println(s.canJump(nums));
  }
}

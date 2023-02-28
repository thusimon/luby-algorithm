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
    private boolean canJumpInternal(int start, int[] nums, Map<Integer, Boolean> records) {
      int len = nums.length;
      if (len == 0 || start >= len - 1) {
        return true;
      }
      int maxJump = nums[start];
      if (maxJump == 0 && start < len - 1) {
        return false;
      }
      boolean result = false;
      for (int i = 1; i <= maxJump; i++) {
        boolean nextJump = false;
        if (records.get(start + i) == null) {
          nextJump = canJumpInternal(start + i, nums, records);
          records.put(start + i, nextJump);
        } else {
          nextJump = records.get(start + i);
        }
        result = result || nextJump;
        if (result) {
          return result;
        }
      }
      return result;
    }
    public boolean canJump(int[] nums) {
      Map<Integer, Boolean> records = new HashMap<>();
      return canJumpInternal(0, nums, records);
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

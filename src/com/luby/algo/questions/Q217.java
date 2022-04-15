package com.luby.algo.questions;

import java.util.HashSet;
import java.util.Set;

public class Q217 {
  class Solution {
    /**
     * Given an integer array nums
     * return true if any value appears at least twice in the array
     * return false if every element is distinct.
     * [1,2,3,1]: true
     * [1,2,3,4]: false
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
      if (nums == null || nums.length < 2) {
        return false;
      }
      Set<Integer> occurSet = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
        if (occurSet.contains(nums[i])) {
          return true;
        } else {
          occurSet.add(nums[i]);
        }
      }
      return false;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q217().new Solution();
    System.out.println(s.containsDuplicate(new int[] {1, 2, 3, 4}));
    System.out.println(s.containsDuplicate(new int[] {1, 2, 3, 1}));
  }
}

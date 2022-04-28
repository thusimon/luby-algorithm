package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Q15 {
  class Solution {
    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
     * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * the solution set must not contain duplicate triplets.
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      if (nums == null || nums.length < 3) {
        return result;
      }
      Arrays.sort(nums);
      for (int idx1 = 0; idx1 < nums.length - 2; idx1++) {
        if (idx1 > 0 && nums[idx1] == nums[idx1 - 1]) {
          continue;
        }
        int idx2 = idx1 + 1;
        int idx3 = nums.length - 1;
        while (idx2 < idx3) {
          int sum = nums[idx1] + nums[idx2] + nums[idx3];
          if (sum == 0) {
            result.add(Arrays.asList(nums[idx1], nums[idx2], nums[idx3]));
            idx3--;
            while (idx2 < idx3 && nums[idx3] == nums[idx3 + 1]) {
              idx3--;
            }
          } else if (sum > 0) {
            idx3--;
          } else {
            idx2++;
          }
        }
      }
      return result;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q15().new Solution();
    System.out.println(s.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
  }
}

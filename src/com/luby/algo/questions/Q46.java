package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q46 {

  class Solution {
    /**
     * Given an array nums of distinct integers
     * return all the possible permutations. You can return the answer in any order.
     * Input: nums = [1,2,3]
     * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     */

    private void swap(int i, int j, int[] nums) {
      int tempi = nums[i];
      nums[i] = nums[j];
      nums[j] = tempi;
    }
    private void recursion(int idx, int[] nums, List<List<Integer>> result) {
      if (idx == nums.length) {
        // the swap reaches to the end, add nums to resut
        result.add(new ArrayList<Integer>(Arrays.stream(nums).boxed().toList()));
      } else {
        // continue the swap and recursion
        for (int i = idx; i < nums.length; i++) {
          swap(idx, i, nums);
          recursion(idx + 1, nums, result);
          swap(idx, i, nums);
        }
      }
    }
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      if (nums == null || nums.length == 0) {
        return result;
      }
      if (nums.length == 1) {
        result.add(Arrays.asList(nums[0]));
        return result;
      }
      recursion(0, nums, result);
      return result;
    }
  }

  public static void main(String[] args) {
    Q46.Solution solution = new Q46().new Solution();
    System.out.println(solution.permute(new int[] {1,2}));
    System.out.println(solution.permute(new int[] {1,2,3}));
  }
}

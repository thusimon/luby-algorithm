package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q78 {
  class Solution {
    /**
     * Given an integer array nums of unique elements, return all possible subsets (the power set).
     * The solution set must not contain duplicate subsets. Return the solution in any order.
     * e.g.
     * Input: nums = [1,2,3]
     * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     * @param nums
     * @return
     */
    private List<List<Integer>> subsetsInternal(int[] nums, int length) {
      List<List<Integer>> subsetsList = new ArrayList<>();
      if (length == 1) {
        subsetsList.add(new ArrayList<>());
        subsetsList.add(new ArrayList<Integer>(){
          {add(nums[length - 1]);}
        });
        return subsetsList;
      }
      List<List<Integer>> smallerSet = subsetsInternal(nums, length - 1);
      for(List<Integer> list : smallerSet) {
        subsetsList.add(list);
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(nums[length - 1]);
        subsetsList.add(list2);
      }
      return subsetsList;
    }
    public List<List<Integer>> subsets(int[] nums) {
      return subsetsInternal(nums, nums.length);
    }
  }

  public static void main(String[] args) {
    Q78.Solution s = new Q78().new Solution();
    int[] nums = new int[]{1, 2, 3};
    List<List<Integer>> subsets = s.subsets(nums);
    System.out.println(subsets.toString());
  }
}

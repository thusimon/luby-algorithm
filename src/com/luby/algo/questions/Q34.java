package com.luby.algo.questions;

import java.util.Arrays;

public class Q34 {
  class Solution {
    /**
     * Given an array of integers nums sorted in non-decreasing order,
     * find the starting and ending position of a given target value.
     * If target is not found in the array, return [-1, -1].
     * You must write an algorithm with O(log n) runtime complexity.
     */
    private int findIndex(int[] nums, int start, int end, int target) {
      while (start <= end) {
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
          return mid;
        }
        if(nums[start] > target || nums[end] < target) {
          return -1;
        } else if (nums[mid] <= target) {
          start = mid + 1;
        } else {
          end = mid -1;
        }
      }
      return -1;
    }

    public int[] searchRange(int[] nums, int target) {
      int firstIdx = findIndex(nums, 0, nums.length -1, target);
      if (firstIdx == -1) {
        return new int[] {-1, -1};
      }
      int lowIdxTemp = firstIdx;
      int highIdxTemp = firstIdx;
      int lowIdx = firstIdx;
      int highIdx = firstIdx;

      while (lowIdxTemp != -1) {
        lowIdxTemp = findIndex(nums, 0, lowIdx - 1, target);
        if (lowIdxTemp != -1) {
          lowIdx = lowIdxTemp;
        }
      }

      while(highIdxTemp != -1) {
        highIdxTemp = findIndex(nums, highIdx + 1, nums.length - 1, target);
        if (highIdxTemp != -1) {
          highIdx = highIdxTemp;
        }
      }

      return new int[] {lowIdx, highIdx};
    }
  }

  public static void main(String[] args) {
    Q34.Solution solution = new Q34().new Solution();
    int[] range = solution.searchRange(new int[] {0,1,1,1,1,5,6}, 1);
    System.out.println(Arrays.toString(range));
    range = solution.searchRange(new int[] {5,7,7,8,8,10}, 8);
    System.out.println(Arrays.toString(range));
    range = solution.searchRange(new int[] {5,7,7,8,8,10}, 6);
    System.out.println(Arrays.toString(range));
    range = solution.searchRange(new int[] {}, 0);
    System.out.println(Arrays.toString(range));
  }
}

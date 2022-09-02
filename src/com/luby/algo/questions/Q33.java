package com.luby.algo.questions;

public class Q33 {
  class Solution {
    /**
     * There is an integer array nums sorted in ascending order (with distinct values).
     * Prior to being passed to your function,
     * nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
     * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
     *
     * Given the array nums after the possible rotation and an integer target,
     * return the index of target if it is in nums, or -1 if it is not in nums.
     *
     * Input: nums = [4,5,6,7,0,1,2], target = 0
     * Output: 4
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchTraverse(int[] nums, int target) {
      if (nums == null || nums.length == 0) {
        return -1;
      }
      for (int idx = 0; idx < nums.length; idx++) {
        if (nums[idx] == target) {
          return idx;
        }
      }
      return -1;
    }

    public int search(int[] nums, int target) {
      if (nums == null || nums.length == 0) {
        return -1;
      }
      if (nums.length == 1) {
        return nums[0] == target ? 0 : -1;
      }
      int start = 0;
      int end = nums.length - 1;
      while (start <= end) {
        int startVal = nums[start];
        int endVal = nums[end];
        int mid = (start + end) / 2;
        int midVal = nums[mid];
        if (midVal == target) {
          return mid;
        }
        if (startVal <= midVal) {
          // start-mid is in ascending order
          if (startVal <= target && target < midVal) {
            // target falls between start-mid
            end = mid - 1;
          } else {
            // target falls between mid-end
            start = mid + 1;
          }
        } else {
          // mid-end is in ascending order
          if (midVal < target && target <= endVal) {
            start = mid + 1;
          } else {
            end = mid - 1;
          }
        }
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    Q33.Solution s = new Q33().new Solution();
    int[] num1 = new int[] {3, 4, 0, 1, 2};
    System.out.println(s.search(num1, 2));
  }
}

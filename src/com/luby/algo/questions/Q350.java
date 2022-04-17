package com.luby.algo.questions;

import java.util.Arrays;

public class Q350 {
  class Solution {
    /**
     * Given two integer arrays nums1 and nums2
     * return an array of their intersection.
     * Each element in the result must appear as many times as it shows in both arrays
     * and you may return the result in any order.
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
      int intersectLen = 0;
      int minLen = Math.max(nums1.length, nums2.length);
      int[] nums2Record = new int[nums2.length];
      int[] result = new int[minLen];
      for (int i = 0; i < nums1.length; i++) {
        int numsi = nums1[i];
        for (int j = 0; j < nums2.length; j++) {
          int numsj = nums2[j];
          if (numsi == numsj && nums2Record[j] == 0) {
            result[intersectLen] = numsi;
            intersectLen++;
            nums2Record[j] = 1;
            break;
          }
        }
      }
      return Arrays.copyOf(result, intersectLen);
    }
  }
  public static void main(String[] args) {
    Solution s = new Q350().new Solution();
    int[] nums1 = new int[] {1, 2, 2, 1};
    int[] nums2 = new int[] {2, 2};
    System.out.println(Arrays.toString(s.intersect(nums1, nums2)));
    nums1 = new int[] {4, 9, 5};
    nums2 = new int[] {9, 4, 9, 8, 4};
    System.out.println(Arrays.toString(s.intersect(nums1, nums2)));
    nums1 = new int[] {1, 2};
    nums2 = new int[] {2, 1};
    System.out.println(Arrays.toString(s.intersect(nums1, nums2)));
    nums1 = new int[] {1, 2, 2, 1};
    nums2 = new int[] {2};
    System.out.println(Arrays.toString(s.intersect(nums1, nums2)));
    nums1 = new int[] {2};
    nums2 = new int[] {1, 2, 2, 1};
    System.out.println(Arrays.toString(s.intersect(nums1, nums2)));
  }
}

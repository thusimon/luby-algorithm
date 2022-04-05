package com.luby.algo.questions;

import java.util.Arrays;

public class Q88 {
  public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int idx1 = m - 1;
      int idx2 = n - 1;
      for (int idx = m + n - 1; idx >= 0; idx--) {
        if (idx1 < 0) {
          nums1[idx] = nums2[idx2];
          idx2--;
          continue;
        }
        if (idx2 < 0) {
          nums1[idx] = nums1[idx1];
          idx1--;
          continue;
        }
        if (nums1[idx1] >= nums2[idx2]) {
          nums1[idx] = nums1[idx1];
          idx1--;
        } else {
          nums1[idx] = nums2[idx2];
          idx2--;
        }
      }
    }
  }
  public static void main(String[] args) {
    Solution s = new Q88().new Solution();
    int[] nums1 = new int[] {1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = new int[] {2,5,6};
    int n = 3;
    s.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
  }
}

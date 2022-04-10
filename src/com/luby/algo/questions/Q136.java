package com.luby.algo.questions;

import java.util.Map;
import java.util.HashMap;

public class Q136 {
  class Solution {
    /**
     * Given a non-empty array of integers nums
     * every element appears twice except for one.
     * Find that single one.
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
      Map<Integer, Integer> numberMap = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
        int curNum = nums[i];
        if (numberMap.containsKey(curNum)) {
          numberMap.remove(curNum);
        } else {
          numberMap.put(curNum, 1);
        }
      }
      return numberMap.keySet().iterator().next();
    }
    public int singleNumberXOR(int[] nums) {
      int xor = 0;
      for (int i = 0; i < nums.length; i++) {
        xor = xor ^ nums[i];
      }
      return xor;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q136().new Solution();
    int[] nums1 = new int[] {2, 2, 1};
    int[] nums2 = new int[] {4, 1, 2, 1, 2};
    int[] nums3 = new int[] {1};
    System.out.println(s.singleNumber(nums1));
    System.out.println(s.singleNumber(nums2));
    System.out.println(s.singleNumber(nums3));
    System.out.println(s.singleNumberXOR(nums1));
    System.out.println(s.singleNumberXOR(nums2));
    System.out.println(s.singleNumberXOR(nums3));
  }
}

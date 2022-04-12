package com.luby.algo.questions;

public class Q169 {
  class Solution {
    /**
     * Given an array nums of size n, return the majority element.
     * The majority element is the element that appears more than [n / 2] times.
     * You may assume that the majority element always exists in the array.
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
      int num = 0;
      int counter = 0;
      for (int n : nums) {
        if (counter == 0) {
          num = n;
        }
        if (num == n) {
          counter++;
        } else {
          counter--;
        }
      }
      return num;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q169().new Solution();
    int[] nums1 = new int[] {3, 2, 3};
    int[] nums2 = new int[] {2, 2, 1, 1, 1, 2, 2};
    System.out.println(s.majorityElement(nums1));
    System.out.println(s.majorityElement(nums2));
  }
}

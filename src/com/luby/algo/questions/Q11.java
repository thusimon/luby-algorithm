package com.luby.algo.questions;

public class Q11 {
  class Solution {
    /**
     * You are given an integer array height of length n.
     * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     * Find two lines that together with the x-axis form a container, such that the container contains the most water.
     * Return the maximum amount of water a container can store.
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * the two integers is 8(idx=1) and 7(idx=8), so area is (8-1)*Min(7, 8) = 49
     * @param height
     * @return
     */
    public int maxAreaBrute(int[] height) {
      if (height == null || height.length < 2) {
        return 0;
      }
      int maxArea = 0;
      for (int i = 0; i < height.length - 1; i++) {
        for (int j = i + 1; j < height.length; j++) {
          int area = (j - i) * Math.min(height[i], height[j]);
          if (area > maxArea) {
            maxArea = area;
          }
        }
      }
      return maxArea;
    }

    public int maxArea(int[] height) {
      if (height == null || height.length < 2) {
        return 0;
      }
      int start = 0;
      int end = height.length - 1;
      int maxArea = 0;
      while (start < end) {
        int area = (end - start) * Math.min(height[start], height[end]);
        if (area > maxArea) {
          maxArea = area;
        }
        if (height[start] < height[end]) {
          start++;
        } else {
          end--;
        }
      }
      return maxArea;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q11().new Solution();
    System.out.println(s.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }
}

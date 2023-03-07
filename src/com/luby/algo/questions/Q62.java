package com.luby.algo.questions;

public class Q62 {
  class Solution {
    /**
     * There is a robot on an m x n grid.
     * The robot is initially located at the top-left corner (i.e., grid[0][0]).
     * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
     * The robot can only move either down or right at any point in time.
     * Given the two integers m and n,
     * return the number of possible unique paths that the robot can take to reach the bottom-right corner.
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
      int[] row = new int[n];
      for (int i = 0; i < n; i++) {
        row[i] = 1;
      }
      for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
          row[j] += row[j - 1];
        }
      }
      return row[n - 1];
    }
  }
  public static void main(String[] args) {
    Solution s = new Q62().new Solution();
    System.out.println(s.uniquePaths(3, 7));
    System.out.println(s.uniquePaths(3, 2));
  }
}

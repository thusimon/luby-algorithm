package com.luby.algo.questions;

import java.util.Arrays;

public class Q73 {
  class Solution {
    /**
     * Given an m x n integer matrix matrix,
     * if an element is 0, set its entire row and column to 0's.
     * e.g
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
      int r = matrix.length;
      int c = matrix[0].length;
      // check if first row contains 0
      boolean firstRowHasZero = false;
      for(int j = 0; j < c; j++) {
        if (matrix[0][j] == 0) {
          firstRowHasZero = true;
          break;
        }
      }
      // check if first column contains 0
      boolean firstColumnHasZero = false;
      for(int i = 0; i < r; i++) {
        if(matrix[i][0] == 0) {
          firstColumnHasZero = true;
          break;
        }
      }
      // map the 1-r rows to first column
      // map the 1-c columns to the first row
      for(int i = 1; i < r; i++) {
        for(int j = 1; j < c; j++) {
          if (matrix[i][j] == 0) {
            matrix[0][j] = 0;
            matrix[i][0] = 0;
          }
        }
      }
      // set 0 rows in first column
      for(int i = 1; i < r; i++) {
        if(matrix[i][0] == 0) {
          for(int j = 1; j < c; j++) {
            matrix[i][j] = 0;
          }
        }
      }
      // set 0 columns in first row
      for(int j = 1; j < c; j++) {
        if(matrix[0][j] == 0) {
          for(int i = 1; i < r; i++) {
            matrix[i][j] = 0;
          }
        }
      }
      // set first row
      if (firstRowHasZero) {
        for(int j = 0; j < c; j++) {
          matrix[0][j] = 0;
        }
      }
      // set first column
      if (firstColumnHasZero) {
        for(int i = 0; i < r; i++) {
          matrix[i][0] = 0;
        }
      }
    }
  }
  public static void main(String[] args) {
    Q73.Solution s = new Q73().new Solution();
    int[][] m1 = new int[][]{
      new int[]{1, 1, 1},
      new int[]{1, 0, 1},
      new int[]{1, 1, 1}
    };
    s.setZeroes(m1);
    System.out.println(Arrays.deepToString(m1));
    int[][] m2 = new int[][]{
      new int[]{0, 1, 2, 0},
      new int[]{3, 4, 5, 2},
      new int[]{1, 3, 1, 5}
    };
    s.setZeroes(m2);
    System.out.println(Arrays.deepToString(m2));
  }
}

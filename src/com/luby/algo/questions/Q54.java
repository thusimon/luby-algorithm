package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
  public class Solution {
    /**
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     * @param matrix
     * @return
     */

    private List<Integer> spiralOrderInternal(int[][] matrix, int x, int y, int w, int h) {
      List<Integer> list = new ArrayList<>();
      if (w == 1) {
        for (int i = 0; i < h; i++) {
          list.add(matrix[x+i][y]);
        }
      } else if (h == 1) {
        for (int i = 0; i < w; i++) {
          list.add(matrix[x][y+i]);
        }
      } else {
        for (int i = 0; i < w; i++) {
          list.add(matrix[x][y+i]);
        }
        for (int i = 1; i < h; i++) {
          list.add(matrix[x+i][y + w - 1]);
        }
        for (int i = 1; i < w; i++) {
          list.add(matrix[x+h-1][y-i]);
        }
      }
      return list;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> result = new ArrayList<>();
      int rowLen = matrix.length;
      int colLen = matrix[0].length;
      int total = rowLen * colLen;
      int rowStep = 0;
      int colStep = 1;
      int rowIdx = 0;
      int colIdx = 0;
      int count = 0;
      while (count < total) {
        result.add(matrix[rowIdx][colIdx]);


        rowIdx += rowStep;
        colIdx += colStep;

      }
      return result;
    }
  }
  public static void main(String[] args) {
    Q54.Solution s = new Q54().new Solution();
  }
}

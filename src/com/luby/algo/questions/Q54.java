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
      if(w == 0 || h == 0) {
        // do nothing
        return list;
      } else if (w == 1) {
        for (int i = 0; i < h; i++) {
          list.add(matrix[x+i][y]);
        }
        return list;
      } else if (h == 1) {
        for (int i = 0; i < w; i++) {
          list.add(matrix[x][y+i]);
        }
        return list;
      } else {
        for (int i = 0; i < w; i++) {
          list.add(matrix[x][y+i]);
        }
        for (int i = 1; i < h; i++) {
          list.add(matrix[x+i][y + w - 1]);
        }
        for (int i = 1; i < w; i++) {
          list.add(matrix[x+h-1][y+w-i-1]);
        }
        for (int i = 1; i < h-1; i++) {
          list.add(matrix[x+h-i-1][y]);
        }
        list.addAll(spiralOrderInternal(matrix, x+1, y+1, w-2, h-2));
        return list;
      }
    }
    public List<Integer> spiralOrder(int[][] matrix) {
      int h = matrix.length;
      int w = matrix[0].length;
      return spiralOrderInternal(matrix, 0, 0, w, h);
    }
  }
  public static void main(String[] args) {
    Q54.Solution s = new Q54().new Solution();
    int[][] matrix = new int[][]{
      new int[]{1,2,3},
      new int[]{4,5,6},
      new int[]{7,8,9}
    };
    System.out.println(s.spiralOrder(matrix));
    matrix = new int[][] {
      new int[]{1,2,3,4},
      new int[]{5,6,7,8},
      new int[]{9,10,11,12}
    };
    System.out.println(s.spiralOrder(matrix));
  }
}

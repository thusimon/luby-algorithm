package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q118 {
  public class Solution {
    /**
     * Given an integer numRows, return the first numRows of Pascal's triangle.
     *        1
     *      1   1
     *    1   2   1
     *  1   3   3   1
     *1   4   6   4   1
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
      List<Integer> firstRow = new ArrayList<>(Arrays.asList(1));
      List<List<Integer>> result = new ArrayList<>();
      result.add(firstRow);
      if (numRows < 1) {
        return null;
      }
      for (int row = 1; row < numRows; row++) {
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        List<Integer> prevRow = result.get(row - 1);
        for (int rowIdx = 0; rowIdx < prevRow.size() - 1; rowIdx++) {
          newRow.add(prevRow.get(rowIdx) + prevRow.get(rowIdx + 1));
        }
        newRow.add(1);
        result.add(newRow);
      }
      return result;
    }
    public void print(List<List<Integer>> pascalTriangle) {
      for (List<Integer> row : pascalTriangle) {
        for (int v : row) {
          System.out.print(v + " ");
        }
        System.out.println();
      }
    }
  }
  public static void main(String[] args) {
    Solution s = new Q118().new Solution();
    List<List<Integer>> pascalTriangle = s.generate(5);
    s.print(pascalTriangle);
  }
}

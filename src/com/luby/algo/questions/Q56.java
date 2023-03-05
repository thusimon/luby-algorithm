package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56 {
  class Solution {
    /**
     * Given an array of intervals where intervals[i] = [start_i, end_i],
     * merge all overlapping intervals,
     * and return an array of the non-overlapping intervals that cover all the intervals in the input.
     * e.g
     * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
      if (intervals.length <= 1) {
        return intervals;
      }
      List<int[]> sorted = Arrays.stream(intervals).sorted((a, b) -> a[0] - b[0]).toList();
      List<int[]> result = new ArrayList<>();
      result.add(sorted.get(0));
      for (int i = 1; i < sorted.size(); i++) {
        int[] prev = result.get(result.size() - 1);
        int[] curr = sorted.get(i);
        if (curr[0] <= prev[1]) {
          // should merge the current range
          prev[1] = Math.max(prev[1], curr[1]);
        } else {
          result.add(curr);
        }
      }
      return result.toArray(int[][]::new);
    }
  }

  private static void print(int[][] result) {
    StringBuilder sb = new StringBuilder();
    sb.append('[');
    for(int[] a : result) {
      sb.append(String.format("[%d, %d], ", a[0], a[1]));
    }
    sb.deleteCharAt(sb.length() - 1);
    sb.deleteCharAt(sb.length() - 1);
    sb.append("]");
    System.out.println(sb.toString());
  }
  public static void main(String[] args) {
    Q56.Solution s = new Q56().new Solution();
    int[][] intervals = new int[][]{
      new int[] {8, 10},
      new int[] {2, 6},
      new int[] {1, 3},
      new int[] {15, 18},
    };
    int[][] result = s.merge(intervals);
    print(result);
  }
}

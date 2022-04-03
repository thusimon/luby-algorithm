package com.luby.algo.questions;

import java.util.Map;
import java.util.HashMap;

public class Q70 {
  public class Solution {
    /**
     * you can move 1 or 2 steps, there are n steps
     * find the total number of solutions
     * @param n
     * @return
     */
    public Map<Integer, Integer> stepMap;

    public Solution() {
      this.stepMap = new HashMap<>();
      this.stepMap.put(1,1);
      this.stepMap.put(2,2);
    }

    public int climbStairsRecursive(int n) {
      boolean isStepInCache = this.stepMap.containsKey(n);
      if (isStepInCache) {
        return this.stepMap.get(n);
      }
      int steps = climbStairsRecursive(n-1) + climbStairsRecursive(n-2);
      this.stepMap.put(n, steps);
      return steps;
    }

    public int climbStaresDP(int n) {
      if (n == 1) {
        return 1;
      }
      if (n == 2) {
        return 2;
      }
      /**
       * 0 1 2 3 4 5
       *         1 1
       *       2 1 1
       *     3 2 1 1
       *   5 3 2 1 1
       * 8 5 3 2 1 1
       */
      int[] stepCount = new int[] {1, 1};
      for (int i = 0; i <= n - 2; i++) {
        int newStep = stepCount[0] + stepCount[1];
        stepCount[1] = stepCount[0];
        stepCount[0] = newStep;
      }
      return stepCount[0];
    }
  }

  public static void main(String[] args) {
    Solution s = new Q70().new Solution();
    System.out.println(String.format("%d, %d", s.climbStairsRecursive(3), s.climbStaresDP(3)));
    System.out.println(String.format("%d, %d", s.climbStairsRecursive(4), s.climbStaresDP(4)));
    System.out.println(String.format("%d, %d", s.climbStairsRecursive(44), s.climbStaresDP(44)));
  }
}

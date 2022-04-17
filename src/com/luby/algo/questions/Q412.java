package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q412 {
  class Solution {
    /**
     * Given an integer n, return a string array answer (1-indexed) where:
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
      List<String> fizzBuzzList = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
          fizzBuzzList.add("FizzBuzz");
        } else if (i % 3 == 0) {
          fizzBuzzList.add("Fizz");
        } else if (i % 5 == 0) {
          fizzBuzzList.add("Buzz");
        } else {
          fizzBuzzList.add(i + "");
        }
      }
      return fizzBuzzList;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q412().new Solution();
    System.out.println(Arrays.toString(s.fizzBuzz(5).toArray()));
  }
}

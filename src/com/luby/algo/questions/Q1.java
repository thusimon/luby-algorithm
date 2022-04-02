package com.luby.algo.questions;

import java.util.*;
import java.util.stream.Collectors;

public class Q1 {
  public class Solution {
    /**
     * indices of the two numbers such that they add up to target
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
      int[] indexs = new int[2];
      if (nums == null || nums.length < 2) {
        return indexs;
      }
      outerloop:
      for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] + nums[j] == target) {
            indexs[0] = i;
            indexs[1] = j;
            break outerloop;
          }
        }
      }
      return indexs;
    }
    public static int[] twoSumImproved(int[] nums, int target) {
      int[] indexs = new int[2];
      if (nums == null || nums.length < 2) {
        return indexs;
      }
      // sort the nums
      List<Map<String, Integer>> numsList = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        Map<String, Integer> map = new HashMap<>();
        map.put("val", nums[i]);
        map.put("idx", i);
        numsList.add(map);
      }
      Collections.sort(numsList, new Comparator<Map<String, Integer>>() {
        @Override
        public int compare(Map<String, Integer> o1, Map<String, Integer> o2) {
          return o1.get("val").compareTo(o2.get("val"));
        }
      });
      int i = 0;
      int j = numsList.size() - 1;
      while (j - i > 0) {
        int sum = numsList.get(i).get("val") + numsList.get(j).get("val");
        if (sum == target) {
          indexs[0] = numsList.get(i).get("idx");
          indexs[1] = numsList.get(j).get("idx");
          break;
        } else if (sum < target) {
          // target is greater than sum, need to increase the left index
          i++;
        } else {
          // target is less than sum, need to decrease the right index
          j--;
        }
      }
      return indexs;
    }
  }
  public static void main(String[] args) {
    //int[] indexs = Solution.twoSumImproved(new int[] {2,7,11,15}, 9);
    int[] indexs = Solution.twoSumImproved(new int[] {3,3}, 6);
    System.out.println(Arrays.stream(indexs).boxed().collect(Collectors.toList()));
  }
}

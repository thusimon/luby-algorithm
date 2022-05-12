package com.luby.algo.questions;

public class Q33 {
  class Solution {
    /**
     * There is an integer array nums sorted in ascending order (with distinct values).
     * Prior to being passed to your function,
     * nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
     * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
     *
     * Given the array nums after the possible rotation and an integer target,
     * return the index of target if it is in nums, or -1 if it is not in nums.
     *
     * Input: nums = [4,5,6,7,0,1,2], target = 0
     * Output: 4
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchTraverse(int[] nums, int target) {
      if (nums == null || nums.length == 0) {
        return -1;
      }
      for (int idx = 0; idx < nums.length; idx++) {
        if (nums[idx] == target) {
          return idx;
        }
      }
      return -1;
    }

    //stop playing the legend of heros, get back to exercise!
    //lu, work hard!
    //another cheat
    //start next week
    //another guilty day
    //will end this week!
    public int search(int[] nums, int target) {
      int start = 0;
      int end = nums.length - 1;
      int mid = start + (end-start)/2;
      while(start <= end){
        if(nums[mid] == target){
          return mid ;
        }
        if(nums[start] <= nums[mid]){
          if(nums[start] <= target && target <= nums[mid]){
            end = mid - 1;
          }
          else{
            start = mid + 1;
          }
        }
        if(nums[mid] <= nums[end]){
          if(nums[mid]<=target && nums[end] >= target){
            start = mid + 1;
          }else{
            end = mid - 1;
          }
        }
        mid = start+ (end - start) /2;
      }
      return -1;
    }
  }
}

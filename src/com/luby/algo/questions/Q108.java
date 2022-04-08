package com.luby.algo.questions;

import com.luby.algo.common.TreeNode;

public class Q108 {
  public class Solution {
    /**
     * nums is in ascending order
     * construct a height balanced BST (subtree height differ at most 1)
     * @param nums
     * @return
     */
    private void addNodeToTree(TreeNode node, int[] nums, int lowIdx, int hightIdx) {
      if (lowIdx == hightIdx) {
        node.val = nums[lowIdx];
        return;
      }
      int midIdx = (lowIdx + hightIdx) / 2;
      if (lowIdx == midIdx && lowIdx < hightIdx) {
        node.val = nums[lowIdx];
        // should add right leaf
        node.right = new TreeNode();
        addNodeToTree(node.right, nums, midIdx + 1, hightIdx);
        return;
      }
      // lowIdx, midIdx, highIdx are all different
      // should add left and right leaf
      node.val = nums[midIdx];
      node.left = new TreeNode();
      node.right = new TreeNode();
      addNodeToTree(node.left, nums, lowIdx, midIdx - 1);
      addNodeToTree(node.right, nums, midIdx + 1, hightIdx);
    }
    public TreeNode sortedArrayToBST(int[] nums) {
      if (nums == null || nums.length < 1) {
        return null;
      }
      TreeNode root = new TreeNode();
      addNodeToTree(root, nums, 0, nums.length - 1);
      return root;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q108().new Solution();
    int[] nums1 = new int[] {-10, -3, 0, 5, 9};
    int[] nums2 = new int[] {1, 3};
    TreeNode root = s.sortedArrayToBST(nums1);
    root.BFSTraverse();
    root = s.sortedArrayToBST(nums2);
    root.BFSTraverse();
  }
}

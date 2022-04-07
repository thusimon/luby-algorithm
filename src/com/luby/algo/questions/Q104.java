package com.luby.algo.questions;

import com.luby.algo.common.TreeNode;

public class Q104 {
  public class Solution {
    /**
     * find a binary tree's maximum depth
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
      if (root == null) {
        return 0;
      }
      return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q104().new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    root.right.right.left = new TreeNode(21);
    System.out.println(s.maxDepth(root));
  }
}

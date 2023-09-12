package com.luby.algo.questions;

import com.luby.algo.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q98 {
  class Solution {
    /**
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     * A valid BST is defined as follows:
     * The left subtree of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     */

    private boolean isValidBSTNode(TreeNode node, double min, double max) {
      if (node == null) {
        return true;
      }
      double val = (double)node.val;
      return val < max && val > min && isValidBSTNode(node.left, min, val) && isValidBSTNode(node.right, val, max);
    }

    public boolean isValidBST(TreeNode root) {
      if (root == null) {
        return false;
      }
      return isValidBSTNode(root, -Double.MAX_VALUE, Double.MAX_VALUE);
    }

    private void inorder(TreeNode node, List<Integer> list) {
      if (node == null) {
        return;
      }
      inorder(node.left, list);
      list.add(node.val);
      inorder(node.right, list);
    }
    public boolean isValidBST2(TreeNode root) {
      // in-order traverse
      List<Integer> list = new ArrayList<>();
      inorder(root, list);
      double min = -Double.MAX_VALUE;
      for(int x : list) {
        if (x <= min) {
          return false;
        }
        min = x;
      }
      return true;
    }
  }
}

package com.luby.algo.questions;

import com.luby.algo.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q101 {
  public class Solution {
    /**
     * given the root, check if the tree is symmetric
     * [1,2,2,3,4,4,3] is symmetric
     *      1
     *  2       2
     *3   4   4   3
     * @param left
     * @param right
     * @return
     */
    private boolean isSymmetricR(TreeNode left, TreeNode right) {
      if (left == null && right == null) {
        return true;
      }
      if (left == null && right !=null) {
        return false;
      }
      if (left != null && right == null) {
        return false;
      }
      if (left.val != right.val) {
        return false;
      }
      return isSymmetricR(left.left, right.right) &&
        isSymmetricR(left.right, right.left);
    }
    public boolean isSymmetricR(TreeNode root) {
      if (root == null) {
        return true;
      }
      return isSymmetricR(root.left, root.right);
    }
    private List<TreeNode> isListSymmetric(List<TreeNode> layer) {
      int halfLen = layer.size() / 2;
      for(int i = 0, j = layer.size() - 1; i < halfLen; i++, j--) {
        TreeNode iVal = layer.get(i);
        TreeNode jVal = layer.get(j);
        if (iVal == null && jVal == null) {
          continue;
        }
        if (iVal == null && jVal != null) {
          return null;
        }
        if (iVal != null && jVal == null) {
          return null;
        }
        if (iVal.val != jVal.val) {
          return null;
        }
      }
      // extend the current layer
      List<TreeNode> newLayer = new ArrayList<>();
      for(int i = 0; i < layer.size(); i++) {
        TreeNode curNode = layer.get(i);
        if (curNode == null) {
          newLayer.add(null);
          newLayer.add(null);
        }
        else {
          newLayer.add(curNode.left);
          newLayer.add(curNode.right);
        }
      }
      return newLayer;
    }
    public boolean isSymmetric(TreeNode root) {
      if (root == null) {
        return true;
      }
      List<TreeNode> layerNodes = new ArrayList<>();
      layerNodes.add(root);
      while(layerNodes.stream().filter(node -> node != null).count() != 0) {
        layerNodes = isListSymmetric(layerNodes);
        if (layerNodes == null) {
          return false;
        }
      }
      return true;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q101().new Solution();
    // construct symmetric tree
    TreeNode tree1 = new TreeNode(1);
    tree1.left = new TreeNode(2);
    tree1.left.left = new TreeNode(3);
    tree1.left.right = new TreeNode(4);
    tree1.right = new TreeNode(2);
    tree1.right.left = new TreeNode(4);
    tree1.right.right = new TreeNode(3);
    // construct non-symmetric tree
    TreeNode tree2 = new TreeNode(1);
    tree2.left = new TreeNode(2);
    tree2.left.right = new TreeNode(3);
    tree2.right = new TreeNode(2);
    tree2.right.right = new TreeNode(3);
    System.out.println(s.isSymmetricR(tree1));
    System.out.println(s.isSymmetricR(tree2));
    System.out.println(s.isSymmetric(tree1));
    System.out.println(s.isSymmetric(tree2));
  }
}

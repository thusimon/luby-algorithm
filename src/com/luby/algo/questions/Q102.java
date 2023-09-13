package com.luby.algo.questions;

import com.luby.algo.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q102 {
  class Solution {
    /**
     * Given the root of a binary tree, return the level order traversal of its nodes' values.
     * (i.e., from left to right, level by level)
     */
    private void levelOrderInternal(TreeNode node, List<List<Integer>> list, int layer) {
      if (node == null) {
        return;
      }
      if (list.size() < layer +1) {
        list.add(new ArrayList<>());
      }
      List<Integer> layerList = list.get(layer);
      layerList.add(node.val);
      levelOrderInternal(node.left, list, layer + 1);
      levelOrderInternal(node.right, list, layer + 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> list = new ArrayList<>();
      if (root == null) {
        return list;
      }
      levelOrderInternal(root, list, 0);
      return list;
    }
  }
}

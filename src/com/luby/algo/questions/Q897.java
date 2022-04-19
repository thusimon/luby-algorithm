package com.luby.algo.questions;

import com.luby.algo.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q897 {
  class Solution {
    /**
     * Given the root of a binary search tree
     * rearrange the tree in in-order
     * so that the leftmost node in the tree is now the root of the tree
     * and every node has no left child and only one right child.
     * @param root
     * @return
     */
    public TreeNode increasingBST(TreeNode root) {
      if (root == null) {
        return null;
      }
      List<Integer> nodes = new ArrayList<>();
      inorder(root, nodes);
      return buildTree(nodes);
    }
    private void inorder(TreeNode node, List<Integer> nodes) {
      if (node == null) {
        return;
      }
      inorder(node.left, nodes);
      nodes.add(node.val);
      inorder(node.right, nodes);
    }

    private TreeNode buildTree(List<Integer> nodes) {
      if (nodes.size() < 1) {
        return null;
      }
      if (nodes.size() == 1) {
        return new TreeNode(nodes.get(0));
      }
      int listHead = nodes.remove(0);
      TreeNode head = new TreeNode(listHead);
      TreeNode curNode = head;
      while (nodes.size() > 0) {
        listHead = nodes.remove(0);
        TreeNode right = new TreeNode(listHead);
        curNode.right = right;
        curNode = right;
      }
      return head;
    }
  }

  public static void main(String[] args) {

  }
}

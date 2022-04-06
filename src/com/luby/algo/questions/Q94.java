package com.luby.algo.questions;

import com.luby.algo.common.TreeNode;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Q94 {
  public class Solution {
    /**
     * inorder traversal of tree: left, current, right
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> inOrder = new ArrayList<>();
      if (root == null) {
        return inOrder;
      }
      Stack<TreeNode> nodes = new Stack<>();
      TreeNode curNode = root;
      while (curNode != null || !nodes.isEmpty()) {
        while (curNode != null) {
          nodes.push(curNode);
          curNode = curNode.left;
        }
        // curNode must be null now
        curNode = nodes.pop();
        inOrder.add(curNode.val);
        curNode = curNode.right;
      }
      return inOrder;
    }

    public List<Integer> inorderTraversalR(TreeNode root) {
      List<Integer> inorder = new ArrayList<>();
      inorderTraveresalRInternal(root, inorder);
      return inorder;
    }

    public void inorderTraveresalRInternal(TreeNode node, List<Integer> inorder) {
      if (node == null) {
        return;
      }
      inorderTraveresalRInternal(node.left, inorder);
      inorder.add(node.val);
      inorderTraveresalRInternal(node.right, inorder);
    }
  }

  public static void main(String[] args) {
    Solution s = new Q94().new Solution();
    //[1,null,2,3]
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    List<Integer> inorder = s.inorderTraversal(root);
    List<Integer> inorderR = s.inorderTraversalR(root);
    System.out.println(inorder);
    System.out.println(inorderR);
  }
}

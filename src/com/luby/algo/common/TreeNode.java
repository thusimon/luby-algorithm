package com.luby.algo.common;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;
  public TreeNode() {
  }
  public TreeNode(int val) {
    this.val = val;
  }
  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
  public void BFSTraverse() {
    List<TreeNode> layer = new ArrayList<>();
    layer.add(this);
    while (layer.stream().filter(v -> v != null).count() > 0) {
      List<TreeNode> nextLayer = new ArrayList<>();
      for (TreeNode n : layer) {
        if (n == null) {
          System.out.print("null ");
          nextLayer.add(null);
          nextLayer.add(null);
        } else {
          System.out.print(n.val + " ");
          nextLayer.add(n.left);
          nextLayer.add(n.right);
        }
      }
      layer = nextLayer;
      System.out.println();
    }
  }
}

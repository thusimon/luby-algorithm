package com.luby.algo.common;

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode() {}
  public ListNode(int val) {
    this.val = val;
  }
  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
  public ListNode(int[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }
    ListNode curNode = this;
    for (int i = 0; i < arr.length - 1; i++) {
      curNode.val = arr[i];
      curNode.next = new ListNode();
      curNode = curNode.next;
    }
    curNode.val = arr[arr.length - 1];
    curNode.next = null;
  }

  public void print() {
    ListNode curNode = this;
    while (curNode != null) {
      System.out.print(curNode.val);
      if (curNode.next != null) {
        System.out.print(", ");
      }
      curNode = curNode.next;
    }
    System.out.print("\n");
  }
}

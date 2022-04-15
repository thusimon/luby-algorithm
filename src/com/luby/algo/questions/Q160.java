package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q160 {
  public class Solution {
    /**
     * Given the heads of two singly linked-lists headA and headB
     * return the node at which the two lists intersect.
     * If the two linked lists have no intersection at all, return null.
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if (headA == null || headB == null) {
        return null;
      }
      ListNode a = headA;
      ListNode b = headB;
      while (a != b) {
        a = a == null ? headB : a.next;
        b = b == null ? headA : b.next;
      }
      return a;
    }
  }
  public static void main(String[] args) {

  }
}
package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q141 {
  public class Solution {
    /**
     * Given head, the head of a linked list
     * determine if the linked list has a cycle in it.
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
      if (head == null) {
        return false;
      }
      ListNode slow = head;
      ListNode fast = slow.next == null ? null : slow.next.next;
      while (slow != null && fast != null) {
        if (slow == fast) {
          return true;
        }
        slow = slow.next;
        fast = fast.next == null ? null : fast.next.next;
      }
      return false;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q141().new Solution();
    ListNode l1 = new ListNode(3);
    ListNode l2 = new ListNode(2); l1.next = l2;
    ListNode l3 = new ListNode(0); l2.next = l3;
    ListNode l4 = new ListNode(-4); l3.next = l4;
    l4.next = l2;
    //System.out.println(s.hasCycle(l1));
    l1 = new ListNode(1);
    l2 = new ListNode(2); l1.next = l2; l2.next = l1;
    //System.out.println(s.hasCycle(l1));
    l1 = new ListNode(1);
    System.out.println(s.hasCycle(l1));
  }
}

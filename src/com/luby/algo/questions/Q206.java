package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q206 {
  class Solution {
    // LuReview
    /**
     * Given the head of a singly linked list, reverse the list
     * and return the reversed list.
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
      // 1 -> 2 -> 3 -> 4
      // head = 3: 1 -> 2 -> 3, 4 -> 3, 3 -> null
      // head = 2: 1 -> 2, 3 -> 2, 2 -> null
      // head = 1: 2 -> 1, 1 -> null
      if (head == null || head.next == null) {
        return head;
      }
      ListNode next = reverseList(head.next);
      head.next.next = head;
      head.next = null;
      return next;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q206().new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    System.out.println(s.reverseList(head).val);
  }
}

package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q19 {
  class Solution {
    /**
     * Given the head of a linked list,
     * remove the nth node from the end of the list and return its head.
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndTraverse(ListNode head, int n) {
      if (head == null) {
        return null;
      }
      int listLen = 0;
      ListNode curNode = head;
      while (curNode != null) {
        listLen ++;
        curNode = curNode.next;
      }
      if (n < 1 || n > listLen) {
        return head;
      }
      int removeIdx = listLen - n;
      int curIdx = 0;
      curNode = head;
      ListNode prevNode = null;
      while (curIdx < removeIdx) {
        curIdx++;
        prevNode = curNode;
        curNode = curNode.next;
      }
      // now remove the curNode
      if (curNode == head) {
        return curNode.next;
      } else if (curNode.next == null) {
        prevNode.next = null;
        return head;
      } else {
        curNode.val = curNode.next.val;
        curNode.next = curNode.next.next;
      }
      return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
      if (head == null) {
        return null;
      }
      ListNode fromEnd = head;
      ListNode fromStart = head;
      // 1 2 3 4 5
      // 5 4 3 2 1
      for (int i = 0; i < n; i++) {
        fromEnd = fromEnd.next;
      }
      if (fromEnd == null) {
        return head.next;
      }
      while (fromEnd.next != null) {
        fromEnd = fromEnd.next;
        fromStart = fromStart.next;
      }
      // remove fromStart
      fromStart.next = fromStart.next.next;
      return head;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q19().new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    ListNode res = s.removeNthFromEnd(head, 1);
    res.print();
  }
}

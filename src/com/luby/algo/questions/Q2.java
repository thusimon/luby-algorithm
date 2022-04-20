package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q2 {
  class Solution {
    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8], Explanation: 342 + 465 = 807.
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode sumNode = new ListNode();
      ListNode curSum = sumNode;
      int overflow = 0;

      while (l1 != null || l2 != null) {
        int l1Val = 0;
        int l2Val = 0;
        if (l1 != null) {
          l1Val = l1.val;
          l1 = l1.next;
        }
        if (l2 != null) {
          l2Val = l2.val;
          l2 = l2.next;
        }
        int sum = l1Val + l2Val + overflow;
        overflow = sum / 10;
        sum %= 10;
        curSum.next = new ListNode(sum);
        curSum = curSum.next;
      }

      if (overflow > 0) {
        curSum.next = new ListNode(overflow);
      }

      return sumNode.next;
    }

    private void printList(ListNode head) {
      while (head != null) {
        System.out.print(head.val + ", ");
        head = head.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Solution s = new Q2().new Solution();
    ListNode l1 = new ListNode(new int[] {2, 4, 3});
    ListNode l2 = new ListNode(new int[] {5, 6, 4});
    s.printList(s.addTwoNumbers(l1, l2));

    l1 = new ListNode(0);
    l2 = new ListNode(0);
    s.printList(s.addTwoNumbers(l1, l2));

    l1 = new ListNode(new int[] {9, 9, 9, 9, 9, 9, 9});
    l2 = new ListNode(new int[] {9, 9, 9, 9});
    s.printList(s.addTwoNumbers(l1, l2));
  }
}

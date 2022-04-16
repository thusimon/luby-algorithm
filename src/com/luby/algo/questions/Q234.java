package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q234 {
  class Solution {
    /**
     * Given the head of a singly linked list, return true if it is a palindrome
     * 1->2->2->1: true
     * 1->2: false
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
      if (head == null  || head.next == null) {
        return true;
      }
      ListNode curNode = head;
      int len = 0;
      while (curNode != null) {
        curNode = curNode.next;
        len++;
      }
      int startIdx = (len + 1) / 2;
      int compareLen = len / 2;
      curNode = head;
      int idx = 0;
      while (idx < startIdx) {
        curNode = curNode.next;
        idx++;
      }
      ListNode halfMiddle = reverse(curNode);
      idx = 0;
      while (idx < compareLen) {
        if (head.val != halfMiddle.val) {
          return false;
        }
        head = head.next;
        halfMiddle = halfMiddle.next;
        idx++;
      }
      return true;
    }

    private ListNode reverse(ListNode head) {
      if (head == null || head.next == null) {
        return head;
      }
      ListNode newHead = reverse(head.next);
      head.next.next = head;
      head.next = null;
      return newHead;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q234().new Solution();
    ListNode list1 = new ListNode(1);

    ListNode list2 = new ListNode(1);
    list2.next = new ListNode(1);

    ListNode list3 = new ListNode(1);
    list3.next = new ListNode(2);

    ListNode list4 = new ListNode(1);
    list4.next = new ListNode(2);
    list4.next.next = new ListNode(1);

    ListNode list5 = new ListNode(1);
    list5.next = new ListNode(2);
    list5.next.next = new ListNode(2);

    ListNode list6 = new ListNode(1);
    list6.next = new ListNode(2);
    list6.next.next = new ListNode(2);
    list6.next.next.next = new ListNode(1);

    System.out.println(s.isPalindrome(list1));
    System.out.println(s.isPalindrome(list2));
    System.out.println(s.isPalindrome(list3));
    System.out.println(s.isPalindrome(list4));
    System.out.println(s.isPalindrome(list5));
    System.out.println(s.isPalindrome(list6));
  }

}

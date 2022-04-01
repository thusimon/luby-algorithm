package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q21 {
  public class Solution {
    private ListNode addValue(ListNode list, int val) {
      list.next = new ListNode(val);
      return list.next;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if (list2 == null) {
        return list1;
      }
      if (list1 == null) {
        return list2;
      }
      ListNode curList1Node = list1;
      ListNode curList2Node = list2;
      ListNode result = null;
      ListNode curResultNode = null;
      int val1 = curList1Node.val;
      int val2 = curList2Node.val;
      if (val1 <= val2) {
        result = new ListNode(val1);
        curList1Node = curList1Node.next;
      } else {
        result = new ListNode(val2);
        curList2Node = curList2Node.next;
      }
      curResultNode = result;
      while (curList1Node != null || curList2Node != null) {
        int val;
        if (curList1Node == null) {
          val2 = curList2Node.val;
          curResultNode = addValue(curResultNode, val2);
          curList2Node = curList2Node.next;
        } else if (curList2Node == null) {
          val1 = curList1Node.val;
          curResultNode = addValue(curResultNode, val1);
          curList1Node = curList1Node.next;
        } else {
          val1 = curList1Node.val;
          val2 = curList2Node.val;
          if (val1 <= val2) {
            // add val1
            curResultNode = addValue(curResultNode, val1);
            curList1Node = curList1Node.next;
          } else {
            // add val2
            curResultNode = addValue(curResultNode, val2);
            curList2Node = curList2Node.next;
          }
        }
      }
      return result;
    }
  }

  public static void main(String[] args) {
    Solution s = new Q21().new Solution();
    ListNode l1 = new ListNode(new int[] {1, 2, 3});
    ListNode l2 = new ListNode(new int[] {1, 3, 4});
    ListNode l3 = new ListNode(new int[] {5});
    ListNode merged = s.mergeTwoLists(l1, l2);
    merged.print();
    merged = s.mergeTwoLists(l1, l3);
    merged.print();
  }
}

package com.luby.algo.questions;

import com.luby.algo.common.ListNode;

public class Q237 {
  class Solution {
    /**
     * Write a function to delete a node in a singly-linked list.
     * You will not be given access to the head of the list,
     * instead you will be given access to the node to be deleted directly.
     * Input: head = [4,5,1,9], input node = 5
     * Output: [4,1,9]
     * The value of each node in the list is unique.
     * The node to be deleted is in the list and is not a tail node
     * @param node
     */
    public void deleteNode(ListNode node) {
      ListNode next = node.next;
      node.val = next.val;
      node.next = next.next;
    }
  }
  public static void main(String[] args) {

  }
}

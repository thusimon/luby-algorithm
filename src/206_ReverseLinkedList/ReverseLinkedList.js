/**
 * Created by Lu on 9/10/2018.
 */
export const ReverseLinkedList1 = (head)=>{
  // iterate
  if (!head){
    return head;
  }
  let previousNode =head;
  let nextNode = head.next;
  while (nextNode){
    // record the next next node
    let nextnextNode = nextNode.next;
    nextNode.next = previousNode;
    previousNode = nextNode;
    nextNode = nextnextNode;
  }
  // now previousNode is head;
  head.next = null;
  return previousNode;
};

const reverseLinkedListInternal = (previousNode, curNode)=>{
  let nextNode = curNode.next;
  curNode.next = previousNode;
  if (!nextNode){
    // curNode is tail;
    return curNode;
  } else {
    return reverseLinkedListInternal(curNode, nextNode);
  }
};
export const ReverseLinkedList2 = (head)=>{
  // recursive
  if (!head){
    return head;
  }
  if (!head.next){
    return head;
  }
  let reversedHead = reverseLinkedListInternal(head, head.next);
  head.next = null;
  return reversedHead;
};

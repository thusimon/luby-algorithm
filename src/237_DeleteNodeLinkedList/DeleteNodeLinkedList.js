/**
 * Created by Lu on 9/11/2018.
 */
const DeleteNode = (node)=>{
  // node is not tail;
  let nextNode = node.next;
  node.val = nextNode.val;
  node.next = nextNode.next;
};

export default DeleteNode;

/**
 * Created by Lu on 8/29/2018.
 */
const MiddleLinkedList = (head)=>{
  let tempArr=[];
  let listLen=0;
  let node=head;
  while(node){
    listLen++;
    tempArr.push(node);
    node=node.next;
  }
  if (listLen>0){
    let midIdx = Math.round((listLen-1)/2);
    return tempArr[midIdx];
  } else {
    return head;
  }
};

export default MiddleLinkedList;

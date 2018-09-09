/**
 * Created by Lu on 9/4/2018.
 */
const NaryTreeLevelTraversal = (root)=>{
  let res=[];
  if(!root){
    return res;
  }
  let stack = [];
  stack.push(root);
  while(stack.length>0){
    let curLayer=[];
    let tempStack = [];
    for (let i=0;i<stack.length;i++){
      let curNode = stack[i];
      curLayer.push(curNode.val);
      if (!curNode.children && curNode.children.length>0){
        tempStack.concat(curNode.children);
      }
    }
    stack = tempStack;
    res.push(curLayer);
  }
  return res;
};

export default NaryTreeLevelTraversal;

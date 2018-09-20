/**
 * Created by Lu on 9/13/2018.
 */
const minDiffInBST = (root)=>{
  //inorder traverse
  let stack = [];
  let arr = [];
  let node = root;
  while(node || stack.length>0){
    if (node){
      stack.push(node);
      node = node.left;
    } else {
      let curNode = stack.pop();
      arr.push(curNode);
      node = curNode.right;
    }
  }
  let res = Number.MAX_VALUE;
  for (let i=0;i<arr.length-1;i++){
    res = Math.min(res,arr[i+1].val-arr[i].val);
  }
  return res;
};

export default minDiffInBST;

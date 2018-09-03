/**
 * Created by Lu on 9/2/2018.
 */
const AvgLevelBinaryTree = (root) =>{
  //BFS search
  let stack = [];
  let bfsarr = [];
  stack.push(root);
  while(stack.length>0){
    bfsarr.push(stack);
    let stackTemp = [];
    for (let i=0;i<stack.length; i++){
      let curStackNode = stack[i];
      if (curStackNode.left){
        stackTemp.push(curStackNode.left);
      }
      if (curStackNode.right){
        stackTemp.push(curStackNode.right);
      }
    }
    stack=stackTemp;
  }
  return bfsarr.map(b=>{
    return b.reduce((accu, cur)=>accu+cur.val,0)/b.length;
  });
};

export default AvgLevelBinaryTree;

/**
 * Created by Lu on 9/8/2018.
 */
const isNumInTree = (root, node, num) =>{
  if(!root){
    return false;
  }
  if (root.val == num && root!=node){
    return true;
  }
  if (root.val>num){
    //find in left
    return isNumInTree(root.left, node, num);
  } else {
    return isNumInTree(root.right, node, num);
  }
};

const findTarget = (root, k)=>{
  if (!root){
    return false;
  }
  let res = false;
  const traverse = (node, k, root)=>{
    if (res){
      // already found
      return;
    }
    if (!node){
      return;
    }
    let nVal = node.val;
    let remain = k-nVal;
    res = isNumInTree(root, node, remain);
    if (res){
      return;
    } else {
      traverse(node.left, k, root);
      traverse(node.right, k, root);
    }
  };
  traverse(root, k, root);
  return res;
};

export default findTarget;

/**
 * Created by Lu on 9/15/2018.
 */
const isLeaf = (node)=>{
  return !node.left && !node.right;
};
const sumOfLeftLeavesInternal = (root)=>{
  if(!root){
    //root is null
    return 0;
  }
  let res = 0;
  if (root.left) {
    if (isLeaf(root.left)) {
      res += root.left.val;
    } else {
      res += sumOfLeftLeavesInternal(root.left);
    }
  }
  if (root.right) {
    if (isLeaf(root.right)){
      res += 0;
    } else {
      res += sumOfLeftLeavesInternal(root.right);
    }
  }
  return res;
};

const sumOfLeftLeaves = (root)=>{
  if (!root){
    return 0;
  }
  if (!root.left && !root.right){
    return 0;
  }
  return sumOfLeftLeavesInternal(root);
};
export default sumOfLeftLeaves;

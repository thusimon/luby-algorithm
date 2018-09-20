/**
 * Created by Lu on 9/18/2018.
 */
const sumOfTree = (node)=>{
  if (!node){
    return 0;
  }
  return node.val+sumOfTree(node.left)+sumOfTree(node.right);
};

const BinaryTreeTilt= (root)=>{
  if (!root){
    return 0;
  }
  // inorder
  let res = BinaryTreeTilt(root.left);
  let leftSum = sumOfTree(root.left);
  let rightSum = sumOfTree(root.right);
  res += Math.abs(leftSum-rightSum);
  res += BinaryTreeTilt(root.right);
  return res;
};

export default BinaryTreeTilt;

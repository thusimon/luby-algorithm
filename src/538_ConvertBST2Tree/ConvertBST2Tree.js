/**
 * Created by Lu on 9/11/2018.
 */
const findSumOfTree = (root)=>{
  if (!root){
    return 0;
  }
  return root.val +
    findSumOfTree(root.left) +
    findSumOfTree(root.right);
};


const convertBST2Tree = (root)=>{
  let treeSum = findSumOfTree(root);
  const convertBST2TreeInternal = (node)=>{
    if (!node){
      return;
    }
    // should be inorder, process the left most node
    convertBST2TreeInternal(node.left);
    treeSum -= node.val;
    node.val += treeSum;
    convertBST2TreeInternal(node.right);
  };
  convertBST2TreeInternal(root);
  return root;
};

export default convertBST2Tree;

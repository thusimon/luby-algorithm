/**
 * Created by Lu on 9/2/2018.
 */
const MaxDepthBinaryTree = (root)=>{
  if (!root){
    return 0;
  }
  return Math.max(MaxDepthBinaryTree(root.left)+1,MaxDepthBinaryTree(root.right)+1);
};

export default MaxDepthBinaryTree;

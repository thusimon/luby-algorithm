/**
 * Created by Lu on 9/4/2018.
 */
const InvertTree = (root)=>{
  if (!root){
    //root is null
    return null;
  }
  let temp = root.left;
  root.left = root.right;
  root.right = temp;
  InvertTree(root.left);
  InvertTree(root.right);
  return root;
};

export default InvertTree;

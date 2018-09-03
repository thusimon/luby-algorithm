/**
 * Created by Lu on 9/1/2018.
 */
const TrimBST = (root, L, R)=>{
  if (!root){
    return null;
  }
  if (root.val < L){
    return TrimBST(root.right, L, R);
  }
  if (root.val > R){
    return TrimBST(root.left, L, R);
  }

  root.left = TrimBST(root.left, L, R);
  root.right = TrimBST(root.right, L, R);
  return root;
};

export default TrimBST;

/**
 * Created by Lu on 9/3/2018.
 */
const IncreaseOrderSearchTree = (root, res)=>{
  if(!root){
    return;
  }
  IncreaseOrderSearchTree(root.left,res);
  res.push(root.val);
  res.push(null);
  IncreaseOrderSearchTree(root.right,res);
};

export default IncreaseOrderSearchTree;

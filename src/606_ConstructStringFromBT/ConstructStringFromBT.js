/**
 * Created by Lu on 9/8/2018.
 */
const constructStringFromBT = (t)=>{
  const preorder = (node) =>{
    let curnodeStr = "";
    if (!node){
      return "";
    }
    curnodeStr+=node.val;
    if(!node.left && !node.right){
      // both left and right are null
      return curnodeStr;
    } else if (node.left && !node.right){
      // left node good, right is null
      curnodeStr+=("(" + preorder(node.left) + ")");
    } else if (!node.left && node.right){
      // left node is null, right is good
      curnodeStr+=("()(" + preorder(node.right)+ ")");
    } else {
      // both left and right are good
      curnodeStr+=("("+preorder(node.left) +")(" + preorder(node.right)+ ")");
    }
    return curnodeStr;
  };
  return preorder(t);
};

export default constructStringFromBT;

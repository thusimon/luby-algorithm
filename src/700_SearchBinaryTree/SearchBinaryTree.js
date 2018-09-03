/**
 * Created by Lu on 9/1/2018.
 */
export const SearchBinaryTreeRC = (root, val)=>{
  //using recursive to search
  if (!root){
    return null;
  }
  if (root.val == val){
    return root;
  } else if(root.val < val){
    return SearchBinaryTreeRC(root.right, val);
  } else {
    return SearchBinaryTreeRC(root.left, val);
  }
};

export const SearchBinaryTreeST = (root, val) =>{
  if (!root){
    return null;
  }
  let stack = [];
  stack.push(root);
  while (stack.length>0){
    let curNode = stack.pop();
    if (curNode.val==val){
      return curNode;
    } else if(curNode.val>val && curNode.left){
      stack.push(curNode.left);
    } else if(curNode.val<val && curNode.right){
      stack.push(curNode.right);
    }
  }
  return [];
};

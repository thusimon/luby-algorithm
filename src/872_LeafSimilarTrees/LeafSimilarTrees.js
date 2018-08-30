/**
 * Created by Lu on 8/29/2018.
 */
import TreeNode from '../common/TreeNode';

const inorderTraverse = (node, leafs) =>{
  if (node){
    if (!node.left && !node.right){
      //leaf node
      leafs.push(node.val);
      return;
    }else{
      //non leaf
      inorderTraverse(node.left, leafs);
      inorderTraverse(node.right, leafs);
    }
  }
};

const LeafSimilarTrees = (root1, root2)=>{
  //inorder left root right
  let root1Leafs = [];
  inorderTraverse(root1, root1Leafs);
  let root2Leafs = [];
  inorderTraverse(root2, root2Leafs);
  if (root1Leafs.length !=root2Leafs.length){
    return false;
  } else {
    for (let i=0;i<root1Leafs.length;i++){
      if (root1Leafs[i]!=root2Leafs[i]){
        return false;
      }
    }
  }
  return true;
};

export default LeafSimilarTrees;

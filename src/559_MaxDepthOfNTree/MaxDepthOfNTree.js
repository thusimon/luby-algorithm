/**
 * Created by Lu on 8/30/2018.
 */
const MaxDepthOfNTree = (node) =>{
  if(!node){
    // node is null, depth is 0;
    return 0;
  }
  if(!node.children){
    // node child is null, depth is 1;
    return 1;
  }
  let childNodeDepth = [];
  for (let i=0; i<node.children.length; i++){
    childNodeDepth.push(MaxDepthOfNTree(node.children[i]));
  }
  return Math.max(...childNodeDepth)+1;
};

export default MaxDepthOfNTree;

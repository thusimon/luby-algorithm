/**
 * Created by Lu on 9/3/2018.
 */
const NaryTreePreorder = (root)=>{
  let stack = [];
  let result = [];
  stack.push(root);
  while(stack.length>0){
    let node = stack.shift();
    if (node){
      result.push(node.val);
      if (node.children && node.children.length>0){
        stack.concat(node.children.reverse());
      }
    }
  }
  return result;
};

export default NaryTreePreorder;

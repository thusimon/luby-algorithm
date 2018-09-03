/**
 * Created by Lu on 9/1/2018.
 */
const NaryTreePostorderTraversal = (root)=>{
  let res = [];
  if(!root){
    return res;
  }
  if (root.children){
    root.children.forEach((child)=>{
      res = res.concat(NaryTreePostorderTraversal(child));
    });
  }
  res.push(root.val);
  return res;
};

export default NaryTreePostorderTraversal;

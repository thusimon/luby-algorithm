/**
 * Created by Lu on 9/13/2018.
 */
const isSameTree = (p,q)=>{
  if (!p&&!q){
    return true;
  }
  if ((!p&&q)||(p&&!q)){
    return false;
  }
  if (p.val!=q.val){
    return false;
  } else {
    return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
  }
};

export default isSameTree;

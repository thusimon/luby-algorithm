/**
 * Created by Lu on 8/27/2018.
 */
const mergeBinaryTrees = (t1, t2)=>{
  if(!t2){
    //t2 is null
    return t1;
  }
  if (!t1){
    //t1 is null;
    return t2;
  }
  // t1 and t2 are not null
  t1.val += t2.val;
  t1.left = mergeBinaryTrees(t1.left, t2.left);
  t1.right = mergeBinaryTrees(t1.right, t2.right);
  return t1;
};

export default mergeBinaryTrees;

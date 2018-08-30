/**
 * Created by Lu on 8/28/2018.
 */
export const treeEqual = (t1, t2)=>{
  if (t1 && t2){
    return treeEqual(t1.left, t2.left)
      && treeEqual(t1.right, t2.right);
  } else if (!t1 && !t2){
    // both t1 and t2 are null or undefined
    return true;
  } else {
    return false;
  }
};

/**
 * Created by Lu on 9/13/2018.
 */
const FindMinDiff = (root)=>{
  // find the nextSmall and nextLarge
  if (!root){
    return Number.MAX_VALUE;
  }
  let nextLarge = root.right;
  while (nextLarge && nextLarge.left){
    nextLarge = nextLarge.left;
  }
  let nextSmall = root.left;
  while (nextSmall && nextSmall.right){
    nextSmall = nextSmall.right;
  }
  let diff = Number.MAX_VALUE;
  if (nextLarge){
    diff = Math.min(diff, Math.abs(root.val-nextLarge.val));
  }
  if (nextSmall){
    diff = Math.min(diff, Math.abs(root.val-nextSmall.val));
  }
  return diff;
};

const getMinimumDifference = (root)=>{
  if (!root){
    return Number.MAX_VALUE;
  }
  return Math.min(FindMinDiff(root),
    getMinimumDifference(root.left),
    getMinimumDifference(root.right)
  )
};

export default getMinimumDifference;

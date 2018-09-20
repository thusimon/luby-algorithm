/**
 * Created by Lu on 9/18/2018.
 */
import TreeNode from '../common/TreeNode';

const sortedArrToBST = (nums)=>{
  if (nums.length<=0){
    return null;
  }
  let midIdx = Math.floor(nums.length/2);
  //console.log(midIdx);
  let node = new TreeNode(nums[midIdx]);
  //slice end index is not included!
  let leftIdx = midIdx;
  let rightIdx = midIdx+1<nums.length?midIdx+1:nums.length;
  let leftParts = nums.slice(0,leftIdx);
  let rightParts = nums.slice(rightIdx,nums.length);
  node.left = sortedArrToBST(leftParts);
  node.right = sortedArrToBST(rightParts);
  return node;
};

export default sortedArrToBST;

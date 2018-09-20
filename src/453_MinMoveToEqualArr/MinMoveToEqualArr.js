/**
 * Created by Lu on 9/13/2018.
 */
const minMoves = (nums)=>{
  let sum = 0;
  let min = Number.MAX_VALUE;
  for (let i=0;i<nums.length;i++){
    sum+=nums[i];
    min = Math.min(min, nums[i]);
  }
  return sum-min*nums.length;
};

export default minMoves;

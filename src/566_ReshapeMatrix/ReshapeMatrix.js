/**
 * Created by Lu on 9/2/2018.
 */
const ReshapeMatrix  =(nums, r, c) =>{
  let rOrg = nums.length;
  let cOrg = nums[0].length;
  let numOrg = rOrg*cOrg;
  if (numOrg!=r*c){
    return nums;
  }
  let reshapeNums = [];
  let reshapeRow = [];
  let count=0;
  while(count<numOrg){
    let r1 = Math.floor(count/cOrg);
    let c1 = count%cOrg;
    reshapeRow.push(nums[r1][c1]);
    if(reshapeRow.length == c){
      reshapeNums.push(reshapeRow);
      reshapeRow = [];
    }
    count++;
  }
  return reshapeNums;
};

export default ReshapeMatrix;

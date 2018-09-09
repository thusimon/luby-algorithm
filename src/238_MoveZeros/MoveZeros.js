/**
 * Created by Lu on 9/5/2018.
 */
const MoveZeros = (nums)=>{
  let zIdx = nums.length;
  for (let i=0;i<nums.length-1;i++){
    if (nums[i]==0){
      if (zIdx>i){
        zIdx = i;
      }
      if (nums[i+1]!=0){
        //swap zIdx, i+1
        let temp = nums[zIdx];
        nums[zIdx] = nums[i+1];
        nums[i+1] = temp;
        //update zIdx;
        zIdx=Math.min(i+1,zIdx+1);
      }
    }
  }
  return nums;
};

export default MoveZeros;

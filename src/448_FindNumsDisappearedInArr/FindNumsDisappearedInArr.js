/**
 * Created by Lu on 9/6/2018.
 */
const findDisappearednumbers = (nums)=>{
  for(let i=0;i<nums.length;i++){
    let curNum = nums[i];
    let idx = Math.abs(curNum)-1;
    if(nums[idx]>0){
      nums[idx] = -nums[idx];
    }
  }
  let res=[];
  for(let i=0;i<nums.length;i++){
    if (nums[i]>0){
      res.push(i+1);
    }
  }
  return res;
};

export default findDisappearednumbers;

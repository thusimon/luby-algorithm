/**
 * Created by Lu on 9/19/2018.
 */
const missingNum = (nums)=>{
  let len = nums.length;
  let sum = nums.reduce((a,c)=>a+c,0);
  return (len)*(len+1)/2-sum;
};

export default missingNum;

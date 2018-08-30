/**
 * Created by Lu on 8/28/2018.
 */
const ArrayPartition = (nums) =>{
  nums = nums.sort((a,b)=>(a-b));
  let sum=0;
  for(let i=0; i<nums.length; i+=2){
    sum+=nums[i];
  }
  return sum;
};
export default ArrayPartition;

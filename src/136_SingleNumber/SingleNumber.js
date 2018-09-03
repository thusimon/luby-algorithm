/**
 * Created by Lu on 9/2/2018.
 */
const SingleNumber = (nums) =>{
  let freq = {};
  for(let i=0; i<nums.length; i++){
    let num=nums[i];
    freq[num] = (freq[num] || 0)+1;
  }
  for (let key in freq){
    if (freq[key]==1){
      return parseInt(key);
    }
  }
};

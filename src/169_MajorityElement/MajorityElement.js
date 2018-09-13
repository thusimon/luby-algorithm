/**
 * Created by Lu on 9/8/2018.
 */
const MajorityElement = (nums)=>{
  let freqMap = {};
  let len = nums.length;
  for (let i=0;i<len;i++){
    let curnum = nums[i];
    if (typeof freqMap[curnum]=="undefined"){
      freqMap[curnum] = 1;
    } else {
      freqMap[curnum] += 1;
    }
  }
  for (let key in freqMap){
    let keyFreq = freqMap[key];
    if(keyFreq>Math.floor(len/2)){
      return parseInt(key);
    }
  }
};

export default MajorityElement;

/**
 * Created by Lu on 9/17/2018.
 */
const DegreeArray = (nums)=>{
  let freqMap = new Map();
  let maxFreq = 0;
  for (let i=0;i<nums.length;i++){
    let curNum = nums[i];
    let curFreq = 1;
    if (!freqMap.has(curNum)){
      freqMap.set(curNum, [i]);

    } else {
      let numFreq = freqMap.get(curNum);
      numFreq.push(i);
      freqMap.set(curNum, numFreq);
      curFreq = Math.max(curFreq, numFreq.length);
    }
    if (maxFreq<curFreq){
      maxFreq = curFreq;
    }
  }
  let res = nums.length;
  freqMap.forEach((v,k)=>{
    if (v.length == maxFreq){
      // this is the freq char
      // find the min
      res = Math.min(res, v[maxFreq-1]-v[0]+1);
    }
  });
  return res;
};

export default DegreeArray;

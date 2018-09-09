/**
 * Created by Lu on 9/5/2018.
 */
const MaxConsecutiveOnes = (nums)=>{
  let numStr = nums.join("");
  let num1s = numStr.split('0');
  let maxLen = 0;
  for(let i=0;i<num1s.length;i++){
    if (num1s[i].length>maxLen){
      maxLen = num1s[i].length;
    }
  }
  return maxLen;
};

export default MaxConsecutiveOnes;

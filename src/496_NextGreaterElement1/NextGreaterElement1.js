/**
 * Created by Lu on 9/2/2018.
 */
const NextGreaterElement1 = (findNums, nums)=>{
  let res = new Array(findNums.length);
  let numsLen = nums.length;
  for (let i=0; i<findNums.length;i++){
    let fnum = findNums[i];
    let subNumIdx = nums.indexOf(fnum);
    if (subNumIdx<0 || subNumIdx==numsLen-1){
      res[i] = -1;
    } else {
      let subNum = nums.slice(subNumIdx+1);
      let resIdx = subNum.findIndex(n=>n>fnum);
      if (resIdx<0){
        res[i]=-1;
      } else {
        res[i] = subNum[resIdx];
      }
    }
  }
  return res;
};

export default NextGreaterElement1;

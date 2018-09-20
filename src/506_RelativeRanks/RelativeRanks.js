/**
 * Created by Lu on 9/17/2018.
 */
const findRelativeRanks = (nums)=>{
  //map the orignal nums
  let numArr = nums.map((n,i)=>[n,i]);
  //sort descending
  numArr.sort((a,b)=>b[0]-a[0]);
  let res = new Array(numArr.length);
  for (let i=0;i<numArr.length;i++){
    let curNum = numArr[i];
    let curNumIdx = curNum[1];
    if (i==0){
      res[curNumIdx] = "Gold Medal";
    } else if (i==1){
      res[curNumIdx] = "Silver Medal";
    } else if (i==2){
      res[curNumIdx] = "Bronze Medal";
    } else {
      res[curNumIdx] = i + 1 + "";
    }
  }
  return res;
};

export default findRelativeRanks;

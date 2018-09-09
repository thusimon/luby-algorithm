/**
 * Created by Lu on 9/6/2018.
 */
const CountBinarySubstr = (s)=>{
  if (s.length<=1){
    return 0;
  }
  let repeatArr = [];
  let curBit = s[0];
  let repeat = 1;
  let i=1;
  while(i<s.length){
    if(s[i]==curBit){
      repeat++;
    } else {
      repeatArr.push(repeat);
      repeat=1;
      curBit = s[i];
    }
    i++;
  }
  if (i==s.length){
    repeatArr.push(repeat);
  }
  let res = 0;
  for (i=0;i<repeatArr.length-1;i++){
    let currepeat = repeatArr[i];
    let nextrepeat = repeatArr[i+1];
    res+=Math.min(currepeat,nextrepeat);
  }
  return res;
};

export default CountBinarySubstr;

/**
 * Created by Lu on 9/9/2018.
 */
const RomanToInt = (s)=>{
  const map1 = {I:1,i:-1,V:5,X:10,x:-10,L:50,C:100,c:-100,D:500,M:1000};
  let res=0;
  for (let i=0;i<s.length;i++){
    let curC = s[i];
    let subStr = s.substring(i);
    if (curC=="C" && (subStr.indexOf("M")>-1||subStr.indexOf("D")>-1)){
      res -= map1[curC];
      continue;
    }
    if (curC=="X" && (subStr.indexOf("L")>-1||subStr.indexOf("C")>-1)){
      res -= map1[curC];
      continue;
    }
    if (curC=="I" && (subStr.indexOf("V")>-1||subStr.indexOf("X")>-1)){
      res -= map1[curC];
      continue;
    }
    res+=map1[curC];
  }
  return res;
};

export default RomanToInt;

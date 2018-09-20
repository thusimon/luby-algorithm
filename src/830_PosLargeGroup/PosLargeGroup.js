/**
 * Created by Lu on 9/19/2018.
 */
const largeGroupPositions = (S)=>{
  let res=[];
  let groupCount = 1;
  for (let i=1;i<S.length;i++){
    let c0 = S[i-1];
    let c1 = S[i];
    if (c1==c0){
      groupCount++;
    } else {
      if (groupCount>=3){
        res.push([i-groupCount,i-1]);
      }
      groupCount=1;
    }
  }
  if (groupCount>=3){
    res.push([S.length-groupCount,S.length-1]);
  }
  return res;
};

export default largeGroupPositions;

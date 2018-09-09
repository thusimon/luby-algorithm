/**
 * Created by Lu on 9/6/2018.
 */
const findDifference = function(s,t){
  // s is original
  let tArr = [...t];
  for (let i=0;i<s.length;i++){
    let sc = s[i];
    let scInt = tArr.indexOf(sc);
    if (scInt>-1){
      tArr.splice(scInt,1);
    }
  }
  return tArr[0];
};

export default findDifference;

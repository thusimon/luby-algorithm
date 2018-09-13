/**
 * Created by Lu on 9/12/2018.
 */
const isAnagram = (s,t)=>{
  let snormalArr = Array.from(s.normalize());
  let tnormalArr = Array.from(t.normalize());
  if (snormalArr.length!=tnormalArr.length){
    return false;
  }
  let res = true;
  for(let i=0;i<snormalArr.length;i++){
    let curChar = snormalArr[i];
    let tidx = tnormalArr.indexOf(curChar);
    if (tidx==-1){
      res = false;
      break;
    } else {
      tnormalArr[tidx] = null;
    }
  }
  return res;
};

export default isAnagram;

/**
 * Created by Lu on 9/17/2018.
 */
const FirstUniqueChar = (s)=>{
  let len = s.length;
  let idxArr = new Array(26).fill(len);
  let charOrg = "a".charCodeAt(0);
  for(let i=0;i<len;i++){
    let c = s[i].charCodeAt(0)-charOrg;
    if (idxArr[c]==len){
      idxArr[c]=i;
    } else {
      idxArr[c]=-1;
    }
  }
  let res = len;
  for (let i=0;i<26;i++){
    if (idxArr[i]>-1&&idxArr[i]<len){
      res = Math.min(res, idxArr[i]);
    }
  }
  return res==len?-1:res;
};

export default FirstUniqueChar;

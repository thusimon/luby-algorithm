/**
 * Created by Lu on 8/30/2018.
 */
function setEq(a,b){
  if(a.size!=b.size){
    return false;
  }
  for(let e of a){
    if(!b.has(e)){
      return false;
    }
  }
  return true;
}
const GroupSpecialEqualStrings = (A) => {
  let groups = [];
  let Alen = A.length;
  let Slen = A[0].length;
  for (let i=0; i<Alen; i++){
    let str = A[i];
    //group the str into two sets str[2n] and str[2n+1]
    let strEven = [...str].filter((s, idx)=>{
      return idx%2==0;
    });
    strEven = new Set(strEven);
    let strOdd = [...str].filter((s, idx)=>{
      return idx%2==1;
    });
    strOdd = new Set(strOdd);
    let strData = {data:[str], even:strEven, odd:strOdd};
    let isNewGroup = true;
    for(let j=0; j<groups.length; j++){
      let group = groups[j];
      let groupEven = group.even;
      let groupOdd = group.odd;
      // must check groupEven has the same char set as strEven
      // and groupOdd has the same char set as strOdd
      if(setEq(groupEven, strEven) && setEq(groupOdd, strOdd)) {
        isNewGroup = false;
        group.data.push(str);
      }
    }
    if (isNewGroup){
      groups.push(strData)
    }
  }
  return groups.length;
};

export default GroupSpecialEqualStrings;

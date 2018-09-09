/**
 * Created by Lu on 9/5/2018.
 */
const LetterCasePermutation = (S)=>{
  let result = [S];
  for(let i=0;i<S.length;i++){
    let tempresult = [];
    let c = S[i];
    if ((/[0-9]/i).test(c)){
      continue;
    } else {
      //found char
      for (let j=0;j<result.length;j++){
        let str = result[j];
        let combineStr1 = str.substring(0,i)+str[i].toLowerCase()+str.substring(i+1);
        let combineStr2 = str.substring(0,i)+str[i].toUpperCase()+str.substring(i+1);
        tempresult.push(combineStr1);
        tempresult.push(combineStr2);
      }
      result = tempresult;
    }
  }
  return result;
};

export default LetterCasePermutation;

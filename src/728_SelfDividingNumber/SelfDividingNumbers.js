/**
 * Created by Lu on 8/28/2018.
 */
const selfDividingNumbers = (left, right) => {
  let result = [];
  for(let i=left; i<=right; i++){
    let strI = i+"";
    let strIDigits = [...strI];
    let isSelfDivide = true;
    for(let j=0;j<strIDigits.length;j++){
      let curDigit = strIDigits[j];
      if(curDigit == "0" || (i%curDigit)!=0){
        isSelfDivide=false;
        break;
      }
    }
    if (isSelfDivide){
      result.push(i);
    }
  }
  return result;
};

export default selfDividingNumbers;

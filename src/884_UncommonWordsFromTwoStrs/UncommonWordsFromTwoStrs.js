/**
 * Created by Lu on 8/30/2018.
 */
const UncommonWordsFromTwoStrs = (A,B)=>{
  let arrA = A.split(' ');
  let arrB = B.split(' ');
  return [...arrA,...arrB].filter((c)=>{
    let isUniqueInA = arrA.indexOf(c) == arrA.lastIndexOf(c);
    let isUniqueInB = arrB.indexOf(c) == arrB.lastIndexOf(c);
    let isInA = arrA.indexOf(c)>-1;
    let isInB = arrB.indexOf(c)>-1;
    //should in A or B, but can not in both
    return isUniqueInA && isUniqueInB && (isInA^isInB);
  });
};
export default UncommonWordsFromTwoStrs;

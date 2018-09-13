/**
 * Created by Lu on 9/10/2018.
 */
const RotateString = (A, B)=>{
  if (A.length!=B.length){
    return false;
  }
  return [A,A].join('').indexOf(B)>-1;
};

export default RotateString;

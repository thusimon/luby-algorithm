/**
 * Created by Lu on 9/3/2018.
 */
const BinaryNumberAlterBits = (n)=>{
  if (n==1 || n==2){
    return true;
  }
  let curBit = n%2;
  n = n>>1;
  while (n>0){
    let tempBit = n%2;
    if (tempBit == curBit){
      return false;
    } else {
      curBit = tempBit;
    }
    n = n>>1;
  }
  return true;
};

export default BinaryNumberAlterBits;

/**
 * Created by Lu on 9/12/2018.
 */
const isOneBitChar = (bits)=>{
  while(bits.length>2){
    if (bits[0]==0){
      bits.shift();
    } else {
      bits.shift();
      bits.shift();
    }
  }
  return bits[0] != 1;
};

export default isOneBitChar;

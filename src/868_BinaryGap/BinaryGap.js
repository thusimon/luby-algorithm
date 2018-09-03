/**
 * Created by Lu on 9/1/2018.
 */
const BinaryGap = (N)=>{
  let maxDist = 0;
  let prevIdx = -1;
  let counter = 0;
  let isFirstFound = false;
  while(N>0){
    let lastBit = N%2;
    if(lastBit){
      //found 1 bit
      if (prevIdx == -1){
        prevIdx = counter;
      }else{
        let dist = counter - prevIdx;
        prevIdx = counter;
        maxDist = Math.max(dist, maxDist);
      }
    }
    N = N>>1;
    counter++;
  }
  return maxDist;
};

export default BinaryGap;

/**
 * Created by Lu on 9/3/2018.
 */
const PrimeNumInBinary = (L,R) =>{
  // R<10^6 1000000 2^19 < 1000000 < 2^20
  // at most 20 "1"
  let primes = [2,3,5,7,11,13,17,19];
  let result = 0;
  for (let i=L; i<=R; i++){
    let ib = i.toString(2);
    let i1BitNum = 0;
    for (let j=0;j<ib.length;j++){
      if (ib[j]==1){
        i1BitNum++;
      }
    }
    if (primes.indexOf(i1BitNum)>-1){
      result++;
    }
  }
  return result;
};

export default PrimeNumInBinary;

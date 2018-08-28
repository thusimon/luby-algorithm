/**
 * Created by Lu on 8/26/2018.
 */
const hammingDist = (x, y)=>{
  const pow2Ints = [1];
  for (let i=1; i<32; i++){
    pow2Ints.push(1<<i);
  }
  let bitAndRes = x^y;
  let result = 0;
  for (let i=0; i<32; i++){
    result +=(bitAndRes&pow2Ints[i])>0;
  }
  return result;
};

export default hammingDist;

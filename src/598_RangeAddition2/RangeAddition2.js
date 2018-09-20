/**
 * Created by Lu on 9/16/2018.
 */
const RangeAddition2 = (m,n,ops)=>{
  let minOpsA = Number.MAX_VALUE;
  let minOpsB = Number.MAX_VALUE;
  if (ops.length==0){
    return m*n;
  }
  for (let i=0;i<ops.length;i++){
    let op = ops[i];
    minOpsA = Math.min(minOpsA, op[0]);
    minOpsB = Math.min(minOpsB, op[1]);
  }
  return minOpsA*minOpsB
};

export default RangeAddition2;

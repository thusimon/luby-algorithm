/**
 * Created by Lu on 9/3/2018.
 */
const FairCandySwap = (A,B)=>{
  let Asum = A.reduce((accu,cur)=>accu+cur,0);
  let Bsum = B.reduce((accu,cur)=>accu+cur,0);
  let finalSum = (Asum+Bsum)/2;
  let diff = finalSum-Bsum;
  // a from A, b from B=> a-b=finalSum-Bsum
  let ASet = [...new Set(A)];
  let BSet = [...new Set(B)];
  for (let i=0; i<ASet.length; i++){
    for (let j=0; j<BSet.length; j++){
      if (ASet[i]-BSet[j]==diff){
        return [ASet[i], BSet[j]];
      }
    }
  }
};

export default  FairCandySwap;

/**
 * Created by Lu on 9/13/2018.
 */
const IsMonotonic = (A)=>{
  if (A.length<=2){
    return true;
  }
  let diff = A[0]-A[1];
  for (let i=1;i<A.length-1;i++){
    let nextDiff = A[i]-A[i+1];
    if (nextDiff==0){
      continue;
    } else {
      if (diff*nextDiff<0){
        //sign change
        return false;
      }
      diff = nextDiff;
    }
  }
  return true;
};

export default IsMonotonic;

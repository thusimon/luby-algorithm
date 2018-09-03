/**
 * Created by Lu on 8/31/2018.
 */
const ShortestDistToChar = (S, C)=>{
  return [...S].map((c, idx, arr)=>{
    if (c==C){
      return 0;
    } else {
      let nextCIdx = S.substring(idx).indexOf(C);
      nextCIdx = nextCIdx>-1?nextCIdx:Number.POSITIVE_INFINITY;
      let previousCIdx = S.substring(0,idx).lastIndexOf(C);
      previousCIdx = previousCIdx>-1?previousCIdx:Number.NEGATIVE_INFINITY;
      return Math.min(idx-previousCIdx, nextCIdx);
    }
  });
};

export default ShortestDistToChar;

/**
 * Created by Lu on 8/29/2018.
 */
const TransposeMatrix = (A)=>{
  let row = A.length;
  let col = A[0].length;
  let B = new Array(col);
  for (let c=0; c<col; c++){
    B[c] = new Array(row);
  }
  for (let r=0; r<row; r++){
    for(let c=0;c<col;c++){
      B[c][r] = A[r][c];
    }
  }
  return B;
};

export default TransposeMatrix;

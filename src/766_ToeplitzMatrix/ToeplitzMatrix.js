/**
 * Created by Lu on 9/1/2018.
 */
const ToeplitzMatrx = (matrix) => {
  let M = matrix.length;
  let N = matrix[0].length;
  let rank = Math.min(M,N);
  let isToeplitz = true;
  for (let i=0; i<M; i++){
    //find the diagonals
    let element = matrix[i][0];
    let rowCounter = M==rank ? rank-i : rank;
    for (let j=1; j<rowCounter && j+i<M; j++){
      if (element != matrix[j+i][j]){
        return false;
      }
    }
  }
  for (let i=0; i<N; i++){
    let element = matrix[0][i];
    let colCounter = N==rank ? rank-i : rank;
    for (let j=1; j<colCounter && j+i<N; j++){
      if (element != matrix[j][j+i]){
        return false;
      }
    }
  }
  return true;
};

export default ToeplitzMatrx;

/**
 * Created by Lu on 8/28/2018.
 */
const ProjectionAreaOf3D = (A)=>{
  // we need to map the array A to three 2D arrays
  let N=A.length;
  let num=0;
  for (let x=0; x<N; x++){
    let bestRow = 0;
    let bestCol = 0;
    for (let y=0; y<N; y++){
      if (A[x][y]>0){
        num++;
      }
      bestRow = Math.max(bestRow, A[x][y]);
      bestCol = Math.max(bestCol, A[y][x]);
    }
    num += bestCol+bestRow;
  }
  return num;
};

export default ProjectionAreaOf3D;

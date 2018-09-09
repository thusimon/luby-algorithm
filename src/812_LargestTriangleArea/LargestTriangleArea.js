/**
 * Created by Lu on 9/4/2018.
 */
const LargestTriangleArea = (points) =>{
  // need to pick three points
  let trangles = [];
  for (let p1=0;p1<points.length;p1++){
    for (let p2=p1+1;p2<points.length;p2++){
      for(let p3=p2+1;p3<points.length;p3++){
        trangles.push([points[p1],points[p2],points[p3]]);
      }
    }
  }
  // now we have all the trangles
  let maxArea = 0;
  for (let t=0;t<trangles.length;t++){
    let curTrangle = trangles[t];
    let [x1,y1] = curTrangle[0];
    let [x2,y2] = curTrangle[1];
    let [x3,y3] = curTrangle[2];
    /**
     * x1 y1 1
     * x2 y2 1
     * x3 y3 1
     */
    let area = Math.abs(x2*y3-x3*y2-x1*y3+x3*y1+x1*y2-x2*y1)/2;
    if (maxArea<area){
      maxArea = area;
    }
  }
  return maxArea;
};

export default LargestTriangleArea;

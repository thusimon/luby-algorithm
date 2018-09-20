/**
 * Created by Lu on 9/16/2018.
 */
const DistSquare = (p1,p2)=>{
  return (p1[0]-p2[0])*(p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]);
};

const numberOfBoomerangs = (points)=>{
  let res = [];
  for(let i=0;i<points.length;i++){
    let p0 = points[i];
    for (let j=0;j<points.length;j++){
      if (i==j){
        continue;
      }
      let p1 = points[j];
      for (let k=j+1;k<points.length;k++){
        let p2 = points[k];
        if (DistSquare(p0,p1)==DistSquare(p0,p2)){
          res.push([p0,p1,p2]);
        }
      }
    }
  }
  return res.length*2;
};

export default numberOfBoomerangs;

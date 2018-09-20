/**
 * Created by Lu on 9/16/2018.
 */
const constructRect = (area)=>{
  let root = Math.sqrt(area);
  let height = Math.ceil(root);
  for (let i=height;i<=area;i++){
    if (area%i==0){
      return [i, area/i];
    }
  }
  return [area, 1];
};

export default constructRect;

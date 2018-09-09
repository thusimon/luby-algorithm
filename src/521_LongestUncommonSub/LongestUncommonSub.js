/**
 * Created by Lu on 9/3/2018.
 */
const LongestUncommonSub = (a,b)=>{
  if (a==b){
    return -1;
  } else{
    return Math.max(a.length, b.length);
  }
};

export default LongestUncommonSub;

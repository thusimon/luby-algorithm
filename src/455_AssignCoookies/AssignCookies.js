/**
 * Created by Lu on 9/17/2018.
 */
const AssignCookies = (g,s)=>{
  // should sort g s
  g.sort((a,b)=>a-b);
  s.sort((a,b)=>a-b);
  let res=0;
  let gidx=0,sidx=0;
  while (gidx<g.length && sidx<s.length){
    let gval = g[gidx];
    let sval = s[sidx];
    if (gval<=sval){
      //can be satisfied
      res++;
      gidx++;
      sidx++;
    } else{
      // can't be satisfied
      sidx++;
    }
  }
  return res;
};

export default AssignCookies;

/**
 * Created by Lu on 9/19/2018.
 */
const findRestaurant = (list1,list2)=>{
  // map list 1 as list
  let storeMap = new Map();
  for (let i=0;i<list1.length;i++){
    let curStore = list1[i];
    storeMap.set(curStore,i);
  }
  let res = [];
  let minIdx = Number.MAX_VALUE;
  for (let i=0;i<list2.length;i++){
    let curStore = list2[i];
    if (storeMap.has(curStore)){
      let curIdx = storeMap.get(curStore);
      let idxSum = curIdx+i;
      minIdx = Math.min(minIdx, idxSum);
      res.push([curStore, idxSum]);
    }
  }
  return res.filter(a=>a[1]==minIdx).map(a=>a[0]);
};

export default findRestaurant;

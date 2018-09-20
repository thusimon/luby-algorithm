/**
 * Created by Lu on 9/19/2018.
 */
const mostCommonWord = (paragraph, banned)=>{
  let pArr = paragraph.split(/[!?',;. ]/);
  let freq = new Map();
  for (let i=0;i<pArr.length;i++){
    let word = pArr[i].toLowerCase();
    if (!word){
      continue;
    }
    if (banned.indexOf(word)>-1){
      continue;
    }
    if (freq.has(word)){
      let f = freq.get(word);
      freq.set(word, f+1);
    } else {
      freq.set(word, 1);
    }
  }
  let maxFreq=0;
  let res=0;
  for(let [k,v] of freq){
    if (maxFreq<v){
      maxFreq  = v;
      res = k;
    }
  }
  return res;
};

export default mostCommonWord;

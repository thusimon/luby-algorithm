/**
 * Created by Lu on 9/4/2018.
 */
const GoatLatin = (S)=>{
  let result=[];
  let vowel = /^[aeiou]/i;
  let SArr = S.split(' ');
  let tail="a";
  for (let i=0;i<SArr.length;i++){
    let word = SArr[i];
    if (vowel.test(word)){
      word = word.substring(1)+word[0];
    }
    word+="ma"+tail;
    result.push(word);
    tail+="a";
  }
  return result.join(' ');
};

export default GoatLatin;

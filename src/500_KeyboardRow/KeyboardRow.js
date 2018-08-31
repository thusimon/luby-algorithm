/**
 * Created by Lu on 8/30/2018.
 */
const KeyboardRow = (words) =>{
  //prepare the rows
  //abcdefghijklmnopqrstuvwxyz
  let keyboardChars=[2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3];
  let result = [];
  for (let i=0; i<words.length; i++){
    let word = words[i];
    let keyboardPosSame=true;
    for (let j=0; j<word.length-1; j++){
      let c1=word[j].toLowerCase();
      let c2=word[j+1].toLowerCase();
      if (keyboardChars[c1.charCodeAt(0)-97]!=keyboardChars[c2.charCodeAt(0)-97]){
        keyboardPosSame=false;
        break;
      }
    }
    if(keyboardPosSame){
      result.push(word);
    }
  }
  return result;
};
export default KeyboardRow;

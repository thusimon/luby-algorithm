/**
 * Created by Lu on 8/26/2018.
 */
const CHAR_MORSECODE = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."];

const UniqueMorseCodeWords = (words)=>{
  let wordsMorseCode = words.map((word, idx) => {
    let curWordMorse = [...word].map((ch, idx)=>{
      let chCode = ch.charCodeAt(0)-97;
      return CHAR_MORSECODE[chCode];
    }).join("");
    return curWordMorse;
  });
  let allUniqueMorse = new Set(wordsMorseCode);
  return allUniqueMorse.size;
};

export default UniqueMorseCodeWords;

const ReverseWordsInString3 = (s)=>{
  let words = s.split(' ');
  words = words.map(w=>[...w].reverse().join(''));
  return words.join(' ');
};
export default ReverseWordsInString3;
